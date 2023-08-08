package com.example.activities.repository;

import com.example.activities.entity.ActivityEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ActivityRepository extends JpaRepository<ActivityEntity,Integer> {
    @Query(value = "SELECT * FROM activity b WHERE b.name=:name",nativeQuery = true)
    List<ActivityEntity> getByName(@Param("name") String name);
}
