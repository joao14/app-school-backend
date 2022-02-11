package appbackend.studentsschool.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

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
    @Column(name = "course_id")
    private Long id; // will be set when persisting

    @Column(name = "name")
    private String name;

    @Column(name = "hours")
    private int hours;

    @Column(name = "state")
    private boolean state;

}
