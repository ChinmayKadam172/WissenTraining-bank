package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entities.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> {
  public List<Student> findBySchool(String school);

  public String countByStandard(int standard);

  @Query("from Student where percentage >= 40 order by percentage")
  public List<Student> myCustomQuery1();

  @Query("from Student where percentage < 40 order by percentage")
  public List<Student> myCustomQuery2();
}
