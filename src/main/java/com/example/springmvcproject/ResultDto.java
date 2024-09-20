package com.example.springmvcproject;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class ResultDto<T> {
    private int count;
    private List<T> data;
}
