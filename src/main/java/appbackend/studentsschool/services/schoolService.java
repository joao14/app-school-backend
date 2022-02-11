package appbackend.studentsschool.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import appbackend.studentsschool.model.Course;
import appbackend.studentsschool.model.Student;
import appbackend.studentsschool.repository.ICourseDao;
import appbackend.studentsschool.repository.IStudentDao;

@Service
public class schoolService {

    @Autowired
    private IStudentDao iStudentDao;

    @Autowired
    private ICourseDao iCourseDao;

    public List<Student> getStudent() {
        return iStudentDao.findAll();
    }

    public void createStudent() {

    }

    public void updateStudent() {

    }

    public void deleteStudent() {

    }

    public List<Course> getCourse() {
        return iCourseDao.findAll();
    }

    public void createCourse() {

    }

    public void updateCourse() {

    }

    public void deleteCourse() {

    }

}
