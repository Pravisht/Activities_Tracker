package com.example.activities.service;

import com.example.activities.entity.Activity;
import com.example.activities.repository.ActivityRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Component
public class ActivityServiceImplements implements ActivityService {

    @Autowired
    ActivityRepository repo;
    public Activity createActivity(Activity act) {
        return repo.save(act);
    }

    @Override
    public List<Activity> getAllActivity() {
        //List<Activity> Activities=new ArrayList<Activity>();
        //repo.findAll().forEach(Act->Activities.add(Act));
        //return Activities;
        return repo.findAll();
    }

    @Override
    public Activity getById(int actId) {
        return repo.findById(actId).orElse(null);
    }

    @Override
    public List<Activity> getByName(String name) {
        List<Activity> ans = repo.getByName(name);
        return ans;
    }
}
