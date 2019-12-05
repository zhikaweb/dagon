package com.stolica.kursybuh.repositories;

import com.stolica.kursybuh.entities.Course;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
public class CourseRepository {

    //здесь храним список курсов
    private List<Course> courses;

    public List<Course> getCourse() {
        return courses;
    }

    //код-заглушка, потом убрать!!!
    @PostConstruct
    public void init() {
        //создали массив курсов
        courses = new ArrayList<>();
        //и запихнули в него все данные
        courses.add(new Course(1, "Курсы бухгалтеров с нуля", "БУН", 8000, "#"));
        courses.add(new Course(2, "Бухгалтерские курсы с 1С:Бухгалтерия", "БУН", 8000, "#"));
        courses.add(new Course(3, "Курсы бухучета для руководителей", "БУН", 8000, "#"));
        courses.add(new Course(4, "Бухучет при УСН", "БУН", 8000, "#"));
        courses.add(new Course(5, "Курсы аудиторов - подготовка и аттестация", "БУН", 8000, "#"));
        courses.add(new Course(6, "Курсы МСФО", "БУН", 8000, "#"));
        courses.add(new Course(7, "Обучение 1С:Зарплата и Кадры 8", "БУН", 8000, "#"));
    }

}


