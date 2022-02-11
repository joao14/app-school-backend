package appbackend.studentsschool.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import appbackend.studentsschool.model.Student;

public interface IStudentDao extends JpaRepository<Student, Long> {

}
