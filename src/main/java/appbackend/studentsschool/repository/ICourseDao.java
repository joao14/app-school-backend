package appbackend.studentsschool.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import appbackend.studentsschool.dto.Course;

public interface ICourseDao extends JpaRepository<Course, Long> {
    

}
