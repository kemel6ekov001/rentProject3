package kg.mega.rentProject.model;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.time.Instant;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "operations")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Operation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    Instant startDate;
    Instant endDate;
    boolean price;
}
