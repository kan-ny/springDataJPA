package net.javaguides.springboot.F1.Service;

import net.javaguides.springboot.F1.entity.Racer;

public interface RacerService {
    Racer getRacer(Long rid);
    Racer createRacer(Racer racer);
}
