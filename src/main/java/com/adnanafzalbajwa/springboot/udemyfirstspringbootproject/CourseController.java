package com.adnanafzalbajwa.springboot.udemyfirstspringbootproject;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

    @RequestMapping("/courses")
    public List<Course> getAllCourses() {
        return Arrays.asList(
                new Course(1, "Java", "Adnan"),
                new Course(1, "Wordpress", "Kamran"),
                new Course(1, "Devops", "Zeshan")
        );
    }
}
