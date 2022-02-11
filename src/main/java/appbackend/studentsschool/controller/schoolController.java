package appbackend.studentsschool.controller;

import org.springframework.web.bind.annotation.*;

import appbackend.studentsschool.dto.Course;
import appbackend.studentsschool.dto.Student;
import appbackend.studentsschool.model.StudentForm;
import appbackend.studentsschool.services.schoolService;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

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
    Student createStudent(@RequestBody StudentForm studentForm) {
        return schoolService.createStudent(studentForm);
    }

    @PutMapping("/students/update")
    Student updateStudent(@RequestBody Student student) {
       return schoolService.updateStudent(student);
    }

    @DeleteMapping("/students/delete")
    public String deleteStudent(@RequestParam Long id) {
        schoolService.deleteStudent(id);
        return "Student delete success";
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
