package kr.fast.diary.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.fast.diary.entity.EmotionTag;
import kr.fast.diary.repository.EmotionTagRepository;

@RestController
public class EmotionController {

    private final EmotionTagRepository emotionRepository;

    public EmotionController(EmotionTagRepository emotionRepository) {
        this.emotionRepository = emotionRepository;
    }

    @GetMapping("/emotions")
    public List<EmotionTag> getEmotions() {
        return emotionRepository.findAll();
    }
}