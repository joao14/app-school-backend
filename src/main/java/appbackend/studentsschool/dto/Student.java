package appbackend.studentsschool.dto;

import java.io.Serializable;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import net.minidev.json.annotate.JsonIgnore;

@Entity
@Table(schema = "S25", name = "student")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@ToString
@Getter
@Setter
public class Student implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "identification", unique = true)
    private String identification;

    @Column(name = "firstName")
    private String firstName;

    @Column(name = "lastName")
    private String lastName;

    @Column(name = "age")
    private int age;

    @Column(name = "email")
    private String email;

    @Column(name = "phone")
    private String phone;

    @JsonIgnore
    @ManyToMany(fetch = FetchType.LAZY ,cascade = CascadeType.ALL)
    @JoinTable(name = "students_courses", joinColumns = @JoinColumn(name = "student_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "course_id", referencedColumnName = "id"))
    private Set<Course> courses= new HashSet<>();


    public Student(String identification,String firstName, String lastName, int age, String email, String phone,Set<Course> courses) {
        this.identification = identification;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
        this.phone = phone;
        this.courses = courses;
    }

}
