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
@Table(name = "Client")
public class Client {

    @Id
    @Column(name = "clientID")
    Integer clientID;
    @Column(name = "name")
    String name;
    @Column(name = "lastName")
    String lastName;
    @Column(name = "phone")
    Long phone;

    @OneToMany(mappedBy = "client")
    private List<Car> cars;

    public Client(Integer clientID, String name, String lastName, Long phone, List<Car> cars) {
        this.clientID = clientID;
        this.name = name;
        this.lastName = lastName;
        this.phone = phone;
        this.cars = cars;
    }
}
