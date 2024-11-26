package com.example.fittracker.controller;


import com.example.fittracker.dto.GoalDTO;
import com.example.fittracker.services.GoalService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.web.servlet.function.ServerResponse.status;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
@CrossOrigin("*")
public class GoalController {

    private final GoalService goalService;

    @PostMapping("/goal")
    public ResponseEntity<?> postGoal(@RequestBody GoalDTO dto){
        try{
            return ResponseEntity.status(HttpStatus.CREATED).body(goalService.postGoal(dto));
        } catch (Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }
    }

    @GetMapping("/goals")
    public ResponseEntity<?> getGoals(){
        try {
            return ResponseEntity.ok(goalService.getGoals());
        } catch(Exception e){
                return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Some thing went wrong. ");
            }
        }

    @GetMapping("/goal/status/{id}")
    public ResponseEntity<?> updateStatus(@PathVariable Long id) {
        try {
            return ResponseEntity.ok(goalService.updateStatus(id));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }
    }
}

