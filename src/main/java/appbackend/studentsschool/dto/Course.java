package appbackend.studentsschool.dto;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import net.minidev.json.annotate.JsonIgnore;

@Entity
@Table(schema = "S25", name = "course")
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
public class Course implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "hours")
    private int hours;

    @Column(name = "state")
    private boolean state;

    @JsonIgnore
    @ManyToMany(fetch= FetchType.LAZY, cascade = CascadeType.ALL , mappedBy = "courses")
    private Set<Student> students= new HashSet<>();

    public Course(String name, int hours, boolean state){
        this.name= name;
        this.hours = hours;
        this.state = state;
    }

}
