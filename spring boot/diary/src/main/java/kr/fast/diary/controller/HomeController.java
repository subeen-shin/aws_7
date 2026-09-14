package kr.fast.diary.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.fast.diary.entity.EmotionTag;
import kr.fast.diary.repository.EmotionTagRepository;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class HomeController {

	private final EmotionTagRepository emtiontagTagRepository;
	
	@GetMapping("/a")
	public ResponseEntity<Object> home(){
		List<EmotionTag> test = emtiontagTagRepository.findAll();
		return ResponseEntity.ok(test);
	}
}
