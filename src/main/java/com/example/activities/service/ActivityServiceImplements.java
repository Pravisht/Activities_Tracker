package com.example.activities.service;

import com.example.activities.entity.ActivityEntity;
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
    public ActivityEntity createActivity(ActivityEntity act) {
        return repo.save(act);
    }

    @Override
    public List<ActivityEntity> getAllActivity() {
        //List<Activity> Activities=new ArrayList<Activity>();
        //repo.findAll().forEach(Act->Activities.add(Act));
        //return Activities;
        return repo.findAll();
    }

    @Override
    public ActivityEntity getById(int actId) {
        return repo.findById(actId).orElse(null);
    }

    @Override
    public List<ActivityEntity> getByName(String name) {
        List<ActivityEntity> ans = repo.getByName(name);
        return ans;
    }

    @Override
    public void deleteActivity(int id) {
        repo.deleteById(id);
    }

}
