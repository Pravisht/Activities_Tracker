package com.example.activities.controller;

import com.example.activities.entity.Activity;
import com.example.activities.repository.ActivityRepository;
import com.example.activities.service.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/act")
public class ActivityController {
    @Autowired
    ActivityService service;
    @PostMapping("/save")
    public Activity saveActivity(@RequestBody Activity act ){
        return service.createActivity(act);

    }
    @GetMapping("/list")
    public List<Activity> getallActivity(){
        return service.getAllActivity();
    }

    @GetMapping("/getid/{actId}")
    public Activity getById(@PathVariable int actId){
        return service.getById(actId);
    }
    @GetMapping("/getname/{name}")
    public List<Activity> getByName(@PathVariable String name){
        return service.getByName(name);
    }
}
