package appbackend.studentsschool.services;

import appbackend.studentsschool.dto.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.autoconfigure.metrics.MetricsProperties;
import org.springframework.stereotype.Service;

import appbackend.studentsschool.dto.Student;
import appbackend.studentsschool.model.StudentForm;
import appbackend.studentsschool.repository.ICourseDao;
import appbackend.studentsschool.repository.IStudentDao;

import java.util.List;
import java.util.Optional;

@Service
public class schoolService {

    @Autowired
    private IStudentDao iStudentDao;

    @Autowired
    private ICourseDao iCourseDao;

    public List<Student> getStudent() {
        return iStudentDao.findAll();
    }

    public Student createStudent(StudentForm studentForm) {
        Student student=new Student(
            studentForm.getFirstName(), studentForm.getLastName(), studentForm.getAge(), studentForm.getEmail(), studentForm.getPhone()
            );
        Student _student=iStudentDao.save(student);
        return iStudentDao.getById(_student.getId());
    }

    public Student updateStudent(Student student) {
        Optional<Student> _student=iStudentDao.findById(student.getId());
        if(_student.isPresent()){
            _student.get().setFirstName(student.getFirstName());
            _student.get().setLastName(student.getLastName());
            _student.get().setAge(student.getAge());
            _student.get().setEmail(student.getEmail());
            _student.get().setPhone(student.getPhone());
            iStudentDao.save(_student.get());
        }
        return _student.get();
    }

    public void deleteStudent(Long id) {
        iStudentDao.deleteById(id);
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
