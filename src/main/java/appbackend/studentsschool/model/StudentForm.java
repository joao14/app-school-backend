package appbackend.studentsschool.model;

import appbackend.studentsschool.dto.Course;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;


@AllArgsConstructor
@Builder
@Data
@ToString
@Getter
@Setter
public class StudentForm {
    
    String identification;
    String firstName;
    String lastName;
    int age;
    String email;
    String phone;
    ArrayList<Long> courses;

}
