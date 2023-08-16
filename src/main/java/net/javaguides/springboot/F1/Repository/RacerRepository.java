package net.javaguides.springboot.F1.Repository;

import net.javaguides.springboot.F1.entity.Racer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RacerRepository extends JpaRepository<Racer, Long> {
}
