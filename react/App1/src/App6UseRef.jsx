import { useRef, useState } from "react";

function App6UseRef(){
	let num1 = 1; //값 변경 =>렌더링x
	const [num2, setNum2] = useState(1); //값 변경 =>렌더링o
	const num3 = useRef(1); //값 변경 =>렌더링x 

const inputRef = 

	const print = ()=> {
	console.log("지역변수 : ", num1);
	console.log("state 변수 : ", num2);
	console.log("ref 변수 : ", num3);
}
print();

const add1 = ()=> { num1++; print()}
const add2 = ()=> { num3.current += 1; print()}
const add3 = ()=> { setNum2(num2 + 1); print()}

	return (
		<div>
			<button onClick={e=>add1()}>지역변수 증가</button>
			<button onClick={e=>add2()}>ref변수 증가</button>
			<button onClick={e=>add3()}>state변수 증가</button>

			<div>
				<button onClick={()=>inputRef.current.focus()}>input태그 포커스</button>
				<input type="text" ref={inputRef}/>
			</div>
		</div>

		
	)
}
export default App6UseRef;