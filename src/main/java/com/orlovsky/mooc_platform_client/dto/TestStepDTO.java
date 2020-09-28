package com.orlovsky.mooc_platform_client.dto;

import com.orlovsky.mooc_platform_client.model.TestAnswer;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.net.URI;
import java.util.Collection;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TestStepDTO {
    private UUID id;
    private UUID courseId;
    private URI descriptionUri;
    private Collection<TestAnswer> answers;
    private int score;
    private int position;
}
