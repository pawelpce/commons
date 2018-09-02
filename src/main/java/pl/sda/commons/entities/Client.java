package pl.sda.commons.entities;

import lombok.*;
import javax.persistence.*;
import javax.validation.constraints.Min;
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
@Table(name = "Client")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "clientID")
    private Integer clientID;

    @NotNull
    @Size(min = 3)
    @Column(name = "name")
    private String name;

    @NotNull
    @Size(min = 3)
    @Column(name = "lastName")
    private String lastName;

    @NotNull
    @Min(9)
    @Column(name = "phone")
    private Long phone;

    @OneToMany(mappedBy = "client", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Car> cars;

}
