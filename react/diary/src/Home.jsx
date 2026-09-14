import { useState } from "react";


function Home(){
	let j = 0;
	const [i, setI] = useState(0);
	console.log("지역변수", j); //렌더링이 되면 값이 다시 초기화
	console.log("state변수", i); //렌더링이 되도 값이 유지

	return (
		<div>
			<h1>홈</h1>
		</div>
	)
}

export default Home;