package appbackend.studentsschool.controller;

import org.springframework.web.bind.annotation.RestController;

import appbackend.studentsschool.model.Course;
import appbackend.studentsschool.model.Student;
import appbackend.studentsschool.services.schoolService;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/app/v1/")
public class schoolController {

    @Autowired
    private schoolService schoolService;

    @GetMapping("/students")
    List<Student> listStudent() {
        List<Student> list = schoolService.getStudent();
        return list;
    }

    @PostMapping("/students/create")
    public String createStudent() {
        return "Hola mundo";
    }

    @PutMapping("/students/update")
    public String updateStudent() {
        return "Hola mundo";
    }

    @DeleteMapping("/students/delete")
    public String deleteStudent() {
        return "Hola mundo";
    }

    @GetMapping("/courses")
    List<Course> listCourse() {
        List<Course> list = schoolService.getCourse();
        return list;
    }

    @PostMapping("/courses/create")
    public String createCourse() {
        return "Hola mundo";
    }

    @PutMapping("/courses/update")
    public String updateCourse() {
        return "Hola mundo";
    }

    @DeleteMapping("/courses/delete")
    public String deleteCourse() {
        return "Hola mundo";
    }

}
