package com.stolica.kursybuh.repositories;

import com.stolica.kursybuh.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;


//создаем интерфейс, задача которого будет обращаться к БД
public interface CourseRepository extends JpaRepository<Course, Integer> {

}
