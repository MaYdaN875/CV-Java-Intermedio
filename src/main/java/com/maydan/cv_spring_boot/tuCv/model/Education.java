package com.maydan.cv_spring_boot.tuCv.model;

import lombok.Data;

@Data
public class Education {
    private String institution;
    private String degree;
    private String period; // Example: "September 2018 - June 2022"
    private String description;
}
