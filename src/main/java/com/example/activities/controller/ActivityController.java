package com.example.activities.controller;

import com.example.activities.entity.ActivityEntity;
import com.example.activities.service.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import java.util.List;

@RestController
@RequestMapping("/act")
public class ActivityController {
    @Autowired
    ActivityService service;
    @PostMapping("/save")
    public ActivityEntity saveActivity(@RequestBody ActivityEntity act ){
        return service.createActivity(act);

    }
    @GetMapping("/list")
    public List<ActivityEntity> getallActivity(){
        return service.getAllActivity();
    }

    @GetMapping("/getid/{actId}")
    public ActivityEntity getById(@PathVariable int actId){
        return service.getById(actId);
    }
    @GetMapping("/getname/{name}")
    public List<ActivityEntity> getByName(@PathVariable String name){
        return service.getByName(name);
    }
    @DeleteMapping("/del/{id}")
    public ResponseEntity<String> deleteActivity(@PathVariable int id){
        service.deleteActivity(id);
        return new ResponseEntity<String>("Activity deleted successfullt", HttpStatus.OK);
        
    }
}
