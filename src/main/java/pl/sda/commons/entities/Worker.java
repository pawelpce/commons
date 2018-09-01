package pl.sda.commons.entities;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.CharArrayReader;
import java.util.List;

@Entity
@Getter
@Setter
@Table (name = "Worker")
public class Worker {

    @Id
    @Column(name = "workerID")
    Integer workerID;
    @Column(name = "name")
    String name;
    @Column(name = "lastName")
    String lastName;
    @Column(name = "position")
    String position;

    @ManyToMany
    @JoinTable(
            name = "work_car",
            joinColumns = @JoinColumn(name = "workerID"),
            inverseJoinColumns = @JoinColumn(name = "carID")
    )
    private List<Car> cars;


    @Override
    public String toString() {
        return "Worker{" +
                "workerID=" + workerID +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
}
