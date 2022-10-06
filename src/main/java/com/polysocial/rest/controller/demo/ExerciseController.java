package com.polysocial.rest.controller.demo;

import com.polysocial.consts.ExerciseAPI;
import com.polysocial.dto.ExerciseDTO;
import com.polysocial.service.ExerciseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExerciseController {

    @Autowired
    private ExerciseService exerciseService;

    @GetMapping(ExerciseAPI.API_GET_EXERCISE)
    public ExerciseDTO getExercise(){
        ExerciseDTO response = exerciseService.getExercise();
        return response;
    }
}
