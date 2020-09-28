package com.orlovsky.mooc_platform_client.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Author {
    private UUID id;
    private String firstName;
    private String lastName;
    private String description;

    @JsonBackReference
    private List<Course> courses;
}
