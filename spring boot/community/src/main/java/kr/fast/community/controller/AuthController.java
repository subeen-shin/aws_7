package kr.fast.community.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.fast.community.dto.MessageResponse;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/api/auth")
public class AuthController {
	
	@PostMapping("/signup")
	public ResponseEntity<Object> signup(){
		
		MessageResponse messageResponse = new MessageResponse (true, "회원 가입이 완료 되었습니다.");
		
		return ResponseEntity.ok(messageResponse);
		
	}
	

}
