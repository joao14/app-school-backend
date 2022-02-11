package appbackend.studentsschool.model;

import lombok.*;

@AllArgsConstructor
@Builder
@Data
@ToString
@Getter
@Setter
public class CourseForm {
    
    private String name;
    private int hours;
    private boolean state;
}
