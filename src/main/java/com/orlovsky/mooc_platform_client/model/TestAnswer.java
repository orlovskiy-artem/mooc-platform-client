package com.orlovsky.mooc_platform_client.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TestAnswer {
    private UUID id;
    private String answerText;
    private boolean isCorrect;
    @JsonBackReference
    private TestStep testStep;
}