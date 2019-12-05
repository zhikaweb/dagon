package com.stolica.kursybuh.services;

import com.stolica.kursybuh.entities.Course;
import com.stolica.kursybuh.repositories.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    //сервису нужен доступ к репозиторию
    //инжектим ссылку на репозиторий
    private CourseRepository courseRepository;

    //добавляем сеттер и аннотацию Автовиред
    @Autowired
    public void setCourseRepository(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    //пишем сервису возможность предоставлять список курсов с запросом у репозитория
    public List<Course> getAllCourses() {
        return courseRepository.getCourse();
    }

    //ищем курс по айди
//    public Course getCourseById(int id) {
//        //у репозитория запрашиваем список всех курсов по id
//        return courseRepository.getCourse().get(id - 1);
//    }

}
