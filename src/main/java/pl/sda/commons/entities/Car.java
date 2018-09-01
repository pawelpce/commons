package pl.sda.commons.entities;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "Car")
public class Car {

    @Id
    @Column(name = "carID")
    Integer carID;
    @Column(name = "color")
    String color;
    @Column(name = "type")
    String type;
    @Column(name = "mark")
    String mark;
    @Column(name = "year")
    Integer year;
    @Column(name = "VIN")
    Long VIN;
    @Column(name = "clientID")
    Integer clientID;


    @ManyToOne
    @JoinColumn(name = "clientID")
    private Client client;


    @ManyToMany (mappedBy = "cars")
    private List<Worker> workers;

    @Override
    public String toString() {
        return "Car{" +
                "carID=" + carID +
                ", color='" + color + '\'' +
                ", type='" + type + '\'' +
                ", mark='" + mark + '\'' +
                ", year=" + year +
                ", VIN=" + VIN +
                ", clientID=" + clientID +
                ", client=" + client +
                ", workers=" + workers +
                '}';
    }
}
