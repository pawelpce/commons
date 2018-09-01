package pl.sda.commons.entities;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

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
