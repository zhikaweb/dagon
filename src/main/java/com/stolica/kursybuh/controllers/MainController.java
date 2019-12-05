package com.stolica.kursybuh.controllers;

import com.stolica.kursybuh.entities.Course;
import com.stolica.kursybuh.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class MainController {

    //доступ к методам КурсСервиса
    //создаем ссылку на КурсСервис
    private CourseService courseService;

    //но создавать мы не имеем права и делаем injection
    @Autowired
    public void setCourseService(CourseService courseService) {
        this.courseService = courseService;
    }

    //доступ к главной станице
    @GetMapping("/")
    public String homePage(Model model) {
        List<Course> allCourses = courseService.getAllCourses();
        model.addAttribute("courses", allCourses);
        return "index";
    }

}
