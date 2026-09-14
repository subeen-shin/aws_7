import {BrowserRouter, Link, Route, Routes} from "react-router-dom";
import Home from "./Home";
import { Signup } from "./component/page/user/Signup";


function App() {

  return (
    <BrowserRouter>
      <ul>
        <li>
          <Link to={"/"}>홈</Link>
        </li>
         <li>
          <Link to={"/test"}>회원가입</Link>
        </li>
      </ul>
   
    <Routes>
      <Route path="/" element={<Home/>}></Route>
      <Route path="/test" element={<Signup/>}></Route>
    </Routes> 
    </BrowserRouter>
  );
}

function Test() {
  return <div><h1>테스트</h1></div>
}

export default App;
