package com.example.fittracker.services;


import com.example.fittracker.dto.ActivityDTO;
import com.example.fittracker.entity.Activity;
import com.example.fittracker.repository.ActivityRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ActivityServiceImpl implements ActivityService {

    private final ActivityRepository activityRepository;
    public ActivityDTO postActivity(ActivityDTO dto) {
        Activity activity = new Activity();

        activity.setDate(dto.getDate());
        activity.setSteps(dto.getSteps());
        activity.setDistance(dto.getDistance());
        activity.setCaloriesBurned(dto.getCaloriesBurned());

        return activityRepository.save(activity).getActivityDTO();
    }

    public List<ActivityDTO> getActivities() {
        List<Activity> activities = activityRepository.findAll();
        return activities.stream().map(Activity::getActivityDTO).collect(Collectors.toList());
    }
}
