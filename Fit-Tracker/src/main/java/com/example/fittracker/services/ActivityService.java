package com.example.fittracker.services;

import com.example.fittracker.dto.ActivityDTO;

import java.util.List;

public interface ActivityService {
    ActivityDTO postActivity(ActivityDTO dto);

    List<ActivityDTO> getActivities();

}