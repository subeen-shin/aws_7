import { useState } from "react";
import { useNavigate } from "react-router-dom";

export function Diary() {
  const navigate = useNavigate();

  // 1. 감정 태그 목록
  const [emotionList] = useState([
    { emotionTagId: 1, name: "행복", emoji: "😊" },
    { emotionTagId: 2, name: "슬픔", emoji: "😢" },
    { emotionTagId: 3, name: "화남", emoji: "😡" },
    { emotionTagId: 4, name: "평온", emoji: "😌" },
    { emotionTagId: 5, name: "신남", emoji: "🥳" },
    { emotionTagId: 6, name: "피곤", emoji: "😴" },
  ]);

  // 2. 일기 텍스트 데이터 상태
  const [diaryData, setDiaryData] = useState({
    date: "",
    title: "",
    content: "",
    emotionTagIds: []
  });

  // 3. 이미지 파일 상태 추가
  const [imageFile, setImageFile] = useState(null);

  const handleChange = (e) => {
    const { name, value } = e.target;
    setDiaryData({
      ...diaryData,
      [name]: value
    });
  };

  // 파일 선택 시 실행되는 함수
  const handleFileChange = (e) => {
    if (e.target.files && e.target.files[0]) {
      setImageFile(e.target.files[0]);
    }
  };

  // 이모지 태그 선택/해제 처리
  const handleTagClick = (tagId) => {
    let updatedTagIds;
    if (diaryData.emotionTagIds.includes(tagId)) {
      updatedTagIds = diaryData.emotionTagIds.filter((id) => id !== tagId);
    } else {
      updatedTagIds = [...diaryData.emotionTagIds, tagId];
    }
    setDiaryData({
      ...diaryData,
      emotionTagIds: updatedTagIds
    });
  };

  // 4. 서버로 데이터 + 파일 전송하는 handleSubmit
  const handleSubmit = async (e) => {
    e.preventDefault();

    const accessToken = localStorage.getItem("accessToken");
    if (!accessToken) {
      alert("로그인이 필요합니다.");
      navigate("/login");
      return;
    }

    // 텍스트와 파일을 함께 보내기 위해 FormData 생성
    const formData = new FormData();

    // DTO 데이터를 JSON Blob 형태로 변환하여 담기
    const dtoBlob = new Blob([JSON.stringify(diaryData)], { type: "application/json" });
    formData.append("dto", dtoBlob);

    // 이미지 파일이 존재하면 FormData에 추가
    if (imageFile) {
      formData.append("image", imageFile);
    }

    try {
      const response = await fetch("/api/diary", {
        method: "POST",
        headers: {
          // ⚠️ 주의: FormData를 보낼 때는 Content-Type을 수동으로 지정하지 않습니다!
          "Authorization": "Bearer " + accessToken
        },
        body: formData
      });

      const result = await response.json();

      if (response.ok && result.success) {
        alert(result.message || "다이어리가 등록되었습니다.");
        navigate("/");
      } else {
        alert("등록 실패: " + (result.message || "오류가 발생했습니다."));
      }

    } catch (error) {
      console.error("서버 통신 에러:", error);
      alert("서버와 통신 중 오류가 발생했습니다.");
    }
  };

  return (
    <div className="container mt-4" style={{ maxWidth: "600px" }}>
      <h1>일기 작성</h1>
      
      <form onSubmit={handleSubmit} style={{ marginTop: "20px" }}>
        
        {/* 날짜 입력 */}
        <div className="mb-3">
          <label className="form-label fw-bold">날짜</label>
          <input 
            type="date" 
            name="date"
            value={diaryData.date}
            onChange={handleChange}
            className="form-control" 
            required
          />
        </div>

        {/* 이모지 감정 태그 선택 영역 */}
        <div className="mb-3">
          <label className="form-label fw-bold d-block">오늘의 기분</label>
          <div className="d-flex gap-2 flex-wrap">
            {emotionList.map((tag) => {
              const isSelected = diaryData.emotionTagIds.includes(tag.emotionTagId);
              return (
                <button
                  type="button"
                  key={tag.emotionTagId}
                  className={`btn ${isSelected ? "btn-primary" : "btn-outline-secondary"}`}
                  onClick={() => handleTagClick(tag.emotionTagId)}
                  style={{ borderRadius: "20px", padding: "8px 16px" }}
                >
                  <span style={{ fontSize: "1.2rem", marginRight: "5px" }}>{tag.emoji}</span>
                  {tag.name}
                </button>
              );
            })}
          </div>
        </div>

        {/* 이미지 첨부 입력 칸 추가 */}
        <div className="mb-3">
          <label className="form-label fw-bold">이미지 첨부</label>
          <input 
            type="file" 
            accept="image/*" 
            onChange={handleFileChange}
            className="form-control" 
          />
        </div>

        {/* 제목 입력 */}
        <div className="mb-3">
          <label className="form-label fw-bold">제목</label>
          <input 
            type="text" 
            name="title"
            placeholder="제목을 입력하세요" 
            value={diaryData.title}
            onChange={handleChange}
            className="form-control" 
            required
          />
        </div>

        {/* 내용 입력 */}
        <div className="mb-3">
          <label className="form-label fw-bold">내용</label>
          <textarea 
            name="content"
            placeholder="내용을 입력하세요" 
            value={diaryData.content}
            onChange={handleChange}
            className="form-control"
            rows="5"
            required
          ></textarea>
        </div>

        <button type="submit" className="btn btn-success w-100 py-2">
          등록하기
        </button>
      </form>
    </div>
  );
}