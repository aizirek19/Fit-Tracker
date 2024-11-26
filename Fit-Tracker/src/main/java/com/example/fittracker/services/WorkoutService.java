package com.example.fittracker.services;

import com.example.fittracker.dto.WorkoutDTO;

import java.util.List;

public interface WorkoutService {

    WorkoutDTO postWorkout(WorkoutDTO workoutDTO);

    List<WorkoutDTO> getWorkouts();
}
