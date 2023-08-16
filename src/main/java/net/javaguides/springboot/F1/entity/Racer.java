package net.javaguides.springboot.F1.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "racer")
public class Racer {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "rid")
    @SequenceGenerator(name = "rid", sequenceName = "sequence_rid", allocationSize = 1)
    private Long rid;
    private int car_no;
    private String driver;
    private String team;
    @CreationTimestamp
    private LocalDateTime createdDate;
    @UpdateTimestamp
    private LocalDateTime updatedDate;
}
