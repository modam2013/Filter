package ru.hogwarts.school.model;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(exclude = "students")
@ToString(exclude = "students")
@Builder
@Entity
public class Faculty {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String color;

    @OneToMany(mappedBy = "faculty", cascade = CascadeType.ALL)
    private Collection<Student> students = new ArrayList<>();

    public long getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Collection<Student> getStudents() {
        return students;
    }

    public void setStudents(Collection<Student> students) {
        this.students = students;
    }
}
