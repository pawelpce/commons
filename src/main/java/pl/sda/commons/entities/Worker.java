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

}
