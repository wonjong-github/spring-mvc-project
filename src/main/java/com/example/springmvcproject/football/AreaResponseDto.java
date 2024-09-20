package com.example.springmvcproject.football;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
@AllArgsConstructor
public class AreaResponseDto {
    private int count;
    private Map<String, Object> filters;
    private List<AreaDTO> areas;
}

@Data
@Entity
@Table(name = "area")
class AreaDTO {

    @Id
    private Long id;
    private String name;
    private String countryCode;
    private String flag;
    private Long parentAreaId;
    private String parentArea;
}