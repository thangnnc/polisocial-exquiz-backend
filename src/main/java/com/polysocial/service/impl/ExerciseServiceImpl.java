package com.polysocial.service.impl;

import com.polysocial.dto.ExerciseDTO;
import com.polysocial.entity.Exercise;
import com.polysocial.service.ExerciseService;
import com.polysocial.utils.Logger;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExerciseServiceImpl implements ExerciseService {

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public ExerciseDTO getExercise() {
        Logger.info("Start getExercise service");
        try {
            Exercise exercise = new Exercise("Cao Thăng", "Mậu Phi", "Hoàng Duy", "Đăng Trường");
            ExerciseDTO response = modelMapper.map(exercise, ExerciseDTO.class);
            return response;
        }catch (Exception ex){
            Logger.error("Get exercise exception: " + ex);
            return null;
        }
    }
}
