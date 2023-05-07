package com.datafluence.sqlparser.controllers;

import com.datafluence.sqlparser.dao.OnboardRepository;
import com.datafluence.sqlparser.models.Onboard;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class OnboardController {

    @Autowired
    private OnboardRepository onboardRepository;
    @PostMapping("/onboard")
    public ResponseEntity<String> onboardMetric(@RequestBody Onboard onboard){
        onboardRepository.save(onboard);
        return new ResponseEntity<>("New metric onboarded", HttpStatus.CREATED);
    }

    @GetMapping("/onboard")
    public ResponseEntity<List<Onboard>> getAllMetrics(){
        List<Onboard> onboardList = onboardRepository.findAll();
        return new ResponseEntity<>(onboardList,HttpStatus.FOUND);
    }

    @GetMapping("/onboard/{metric_name}")
    public ResponseEntity<Optional<Onboard>> getMetricByName(@PathVariable String metric_name){
        Optional<Onboard> onboard = onboardRepository.findById(metric_name);
        return new ResponseEntity<>(onboard,HttpStatus.FOUND);
    }

}
