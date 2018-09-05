package pl.sda.commons.entities;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@Builder
@ToString
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
    String VIN;


    @ManyToOne
    @JoinColumn(name = "clientID")
    private Client client;


    @ManyToMany (mappedBy = "cars")
    private List<Worker> workers;

    public Car(Integer carID, String color, String type, String mark, Integer year, String VIN, Client client, List<Worker> workers) {
        this.carID = carID;
        this.color = color;
        this.type = type;
        this.mark = mark;
        this.year = year;
        this.VIN = VIN;
        this.client = client;
        this.workers = workers;
    }
}
