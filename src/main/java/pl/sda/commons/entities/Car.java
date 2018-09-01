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
    Long VIN;


    @ManyToOne
    @JoinColumn(name = "clientID")
    private Client client;


    @ManyToMany (mappedBy = "cars")
    private List<Worker> workers;

}
