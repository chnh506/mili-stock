package com.milistock.develop.dto;
import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BoardAnswerDto {
    
    private Long boardId;
    @NotBlank
    private String answer;
}
