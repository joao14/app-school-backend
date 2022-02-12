package appbackend.studentsschool.services;

import appbackend.studentsschool.dto.Course;
import appbackend.studentsschool.model.CourseForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.autoconfigure.metrics.MetricsProperties;
import org.springframework.stereotype.Service;

import appbackend.studentsschool.dto.Student;
import appbackend.studentsschool.model.StudentForm;
import appbackend.studentsschool.repository.ICourseDao;
import appbackend.studentsschool.repository.IStudentDao;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

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
        Set<Course> courses=new HashSet<>();
        for (Long id:studentForm.getCourses()
             ) {
            Optional<Course> course= iCourseDao.findById(id);
            if(course.isPresent())
                courses.add(course.get());
        }
        Student student=new Student(studentForm.getIdentification(),
                studentForm.getFirstName(), studentForm.getLastName(),
                studentForm.getAge(), studentForm.getEmail(), studentForm.getPhone(), courses
        );
        Student _student=iStudentDao.save(student);
       return (iStudentDao.findById(_student.getId())).stream().findFirst().orElse(null);
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

    public Course createCourse(CourseForm courseForm) {
        Course course=new Course(
                courseForm.getName(), courseForm.getHours(), courseForm.isState()
        );
        Course _course=iCourseDao.save(course);
        return iCourseDao.getById(_course.getId());
    }

    public Course updateCourse(Course course) {
        Optional<Course> _course=iCourseDao.findById(course.getId());
        if(_course.isPresent()){
            _course.get().setName(course.getName());
            _course.get().setHours(course.getHours());
            _course.get().setState(course.isState());
            iCourseDao.save(_course.get());
        }
        return _course.get();
    }

    public void deleteCourse(Long id) {
        iCourseDao.deleteById(id);
    }

}
