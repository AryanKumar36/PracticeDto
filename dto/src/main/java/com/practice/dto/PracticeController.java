package com.practice.dto;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/practice")
@AllArgsConstructor
public class PracticeController {
    private final PracticeService practiceService;

    @GetMapping
    public List<PracticeDto> getAllPractices() {
        return practiceService.getAllPractices();
    }
}
