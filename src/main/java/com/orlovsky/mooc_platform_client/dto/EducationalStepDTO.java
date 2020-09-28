package com.orlovsky.mooc_platform_client.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.net.URI;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EducationalStepDTO {
    private UUID id;
    private UUID courseId;
    private URI eduMaterialUri;
    private int position;
}

