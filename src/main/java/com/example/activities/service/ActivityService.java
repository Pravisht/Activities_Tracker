package com.example.activities.service;


import com.example.activities.entity.Activity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ActivityService {
    //create/insert , list , get by name , delete
    public default Activity createActivity(Activity act) {
        return null;
    }
    public default List<Activity> getAllActivity(){
        return null;
    }
    public default Activity getById(int actId ){
        return null;
    }
    public default List<Activity> getByName(String name){
     return null;
    }

}
