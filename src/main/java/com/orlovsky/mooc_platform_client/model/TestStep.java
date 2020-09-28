package com.orlovsky.mooc_platform_client.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.net.URI;
import java.util.Collection;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TestStep implements Step {
    private UUID id;

    @JsonBackReference
    private Course course;

    private URI descriptionUri;
    private Collection<TestAnswer> answers;
    private int score;
    private int position;
}

