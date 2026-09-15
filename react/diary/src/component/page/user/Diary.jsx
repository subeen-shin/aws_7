import { useState } from "react";

export function Diary() {
  const [write, setWrite] = useState(false);

  return (
    <div>
      <h1>다이어리</h1>

      {!write ? (
        <button onClick={() => setWrite(true)}>
          작성
        </button>
      ) : (
        <div>
          <input type="text" placeholder="제목" />
          <br />
          <textarea placeholder="내용"></textarea>
          <br />
          <button>등록</button>
        </div>
      )}
    </div>
  );
}