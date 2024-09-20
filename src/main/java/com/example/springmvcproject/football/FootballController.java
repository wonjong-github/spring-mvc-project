package com.example.springmvcproject.football;

import com.example.springmvcproject.ResultDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.List;

@RestController
@RequiredArgsConstructor
@Slf4j
public class FootballController {
    private final FootballService footballService;

    @GetMapping("/areas")
    public ResultDto<AreaDTO> getAllAreas() {
        List<AreaDTO> allAreas = footballService.getAllAreas();
        return new ResultDto<>(allAreas.size(), allAreas);
    }
}
