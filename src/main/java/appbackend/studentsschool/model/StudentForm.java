package appbackend.studentsschool.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@AllArgsConstructor
@Builder
@Data
@ToString
@Getter
@Setter
public class StudentForm {
    
   
    String firstName;
    String lastName;
    int age;
    String email;
    String phone;

}
