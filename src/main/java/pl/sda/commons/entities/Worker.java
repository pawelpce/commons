package pl.sda.commons.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
@Table(name = "Worker")
public class Worker {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "workerID")
    private Integer workerID;

//    @NotNull
//    @Size(min = 3)
    @Column(name = "name")
    private String name;

    @Column(name = "lastName")
//    @NotNull
//    @Size(min = 3)
    private String lastName;

    @Column(name = "position")
//    @NotNull
//    @Size(min = 3)
    private String position;

    @JsonIgnore
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
