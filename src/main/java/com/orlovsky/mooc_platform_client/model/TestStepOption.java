package com.orlovsky.mooc_platform_client.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class TestStepOption {
    private UUID id;
    private String optionText;
    private boolean isCorrect;
}