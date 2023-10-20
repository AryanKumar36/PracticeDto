package com.practice.dto;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class PracticeService {
@Autowired
    private final PracticeRepository practiceRepository;
    private final ModelMapper modelMapper;

    @Autowired
    public PracticeService(PracticeRepository practiceRepository, ModelMapper modelMapper) {
        this.practiceRepository = practiceRepository;
        this.modelMapper = modelMapper;
    }

    public List<PracticeDto> getAllPractices() {
        List<Practice> practices = practiceRepository.findAll();
        List<PracticeDto> practiceDtos = new ArrayList<>();

        for (Practice practice : practices) {
            PracticeDto practiceDto = modelMapper.map(practice, PracticeDto.class);
            practiceDtos.add(practiceDto);
        }


        return practiceDtos;
    }
}
