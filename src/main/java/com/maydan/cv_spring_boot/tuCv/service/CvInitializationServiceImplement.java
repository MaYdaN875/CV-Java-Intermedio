package com.maydan.cv_spring_boot.tuCv.service;

import com.maydan.cv_spring_boot.tuCv.model.*;
import org.springframework.stereotype.Service;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Service
public class CvInitializationServiceImplement implements CvInitializationService{
    @Override
    public CvData initializeCvData() {
        CvData cvData = new CvData();

        PersonalDetails personalDetails = new PersonalDetails();
        personalDetails.setFirstName("angel");
        personalDetails.setLastName("Brambila");
        personalDetails.setPhone("3329269331");
        personalDetails.setEmail("danielleon0100@gmail.com");

        personalDetails.setAddress("some place in the earth");
        personalDetails.setCity("guadalajara jal");
        personalDetails.setProvince("Los Obeliscos");
        personalDetails.setPostalCode("44820");

        cvData.setPersonalDetails(personalDetails);

        //List<Education> educations = new ArrayList<>();
        Education education = new Education();

        education.setDegree("Software Development");
        education.setInstitution("Centro de enseñanza tecnica industrial");
        education.setDescription("Ing");
        education.setPeriod("2022-2026");

        //educations.add(education);
        cvData.setEducations(Collections.singletonList(education));

        Experience experience = new Experience();

        experience.setCompany("Corporativo Fragua");
        experience.setJobTitle("Frontend Developer");
        experience.setDescription("Frontend developer en el corporativo fragua");
        experience.setPeriod("July 2025 - April 2026");

        cvData.setExperiences(List.of(experience));

        Skill skill = new Skill();

        skill.setName("React");
        skill.setLevel("Intermediate");

        Skill skill1 = new Skill();

        skill1.setName("Tailwind");
        skill1.setLevel("Intermediate");

        cvData.setSkills(Arrays.asList(skill1,skill));
        return cvData;
    }
}
