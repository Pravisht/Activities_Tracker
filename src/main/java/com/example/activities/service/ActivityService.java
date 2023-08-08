package com.example.activities.service;


import com.example.activities.entity.ActivityEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ActivityService {
    //create/insert , list , get by name , delete
    public default ActivityEntity createActivity(ActivityEntity act) {
        return null;
    }
    public default List<ActivityEntity> getAllActivity(){
        return null;
    }
    public default ActivityEntity getById(int actId ){
        return null;
    }
    public default List<ActivityEntity> getByName(String name){
     return null;
    }
    public void deleteActivity(int id);
}
