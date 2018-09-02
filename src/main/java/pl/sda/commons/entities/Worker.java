package pl.sda.commons.entities;

import lombok.*;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@Table(name = "Worker")
public class Worker {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "workerID")
    private Integer workerID;

    @NotNull
    @Size(max = 3)
    @Column(name = "name")
    private String name;

    @Column(name = "lastName")
    @NotNull
    @Size(max = 3)
    private String lastName;

    @Column(name = "position")
    @NotNull
    @Size(max = 3)
    private String position;

    @ManyToMany
    @JoinTable(
            name = "work_car",
            joinColumns = @JoinColumn(name = "workerID"),
            inverseJoinColumns = @JoinColumn(name = "carID")
    )
    private List<Car> cars;

}
