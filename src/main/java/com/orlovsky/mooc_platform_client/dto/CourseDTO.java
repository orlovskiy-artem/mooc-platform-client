package com.orlovsky.mooc_platform_client.dto;

import com.orlovsky.mooc_platform_client.model.Author;
import com.orlovsky.mooc_platform_client.model.CourseStatus;
import com.orlovsky.mooc_platform_client.model.EducationalStep;
import com.orlovsky.mooc_platform_client.model.TestStep;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CourseDTO {
    private UUID id;
    private String title;
    private String description;
    private int duration;
    private CourseStatus status;
    private long price;
    private int numberOfSteps;
}
