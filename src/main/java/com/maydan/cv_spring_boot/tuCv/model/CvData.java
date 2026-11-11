package com.maydan.cv_spring_boot.tuCv.model;

import lombok.Data;

import java.util.List;

@Data
public class CvData {
    private PersonalDetails personalDetails;
    private List<Education> educations;
    private List<Experience> experiences;
    private List<Skill> skills;
}
