package com.example.activities.repository;

import com.example.activities.entity.Activity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ActivityRepository extends JpaRepository<Activity,Integer> {
    @Query(value = "SELECT * FROM activity b WHERE b.name=:name",nativeQuery = true)
    List<Activity> getByName(@Param("name") String name);
}
