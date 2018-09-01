package pl.sda.commons.entities;

import lombok.*;
import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@Table(name = "Car")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "carID")
    private Integer carID;

    @Column(name = "color")
    private String color;

    @Column(name = "type")
    private String type;

    @Column(name = "mark")
    private String mark;

    @Column(name = "year")
    private Integer year;

    @Column(name = "VIN")
    private String VIN;

    @ManyToOne
    @JoinColumn(name = "clientID")
    private Client client;

    @ManyToMany(mappedBy = "cars", cascade = CascadeType.ALL)
    private List<Worker> workers;

}
