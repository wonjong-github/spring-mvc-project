package com.example.springmvcproject.football;

import lombok.RequiredArgsConstructor;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FootballService {
    private final RestTemplate restTemplate;
    private final AreaRepository areaRepository;
    private final Environment env;

    public List<AreaDTO> getAllAreas() {
        AreaResponseDto areaResponseDto = restTemplate.getForObject(env.getProperty("football.url"), AreaResponseDto.class);
        List<AreaDTO> areas = areaResponseDto.getAreas();
        return areaRepository.saveAll(areas);
    }
}
