package pl.sda.commons.entities;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
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

    @OneToMany
    @JoinColumn(name = "carID")
    private List<Car> cars;


    @Override
    public String toString() {
        return "Client{" +
                "clientID=" + clientID +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phone=" + phone +
                '}';
    }
}
