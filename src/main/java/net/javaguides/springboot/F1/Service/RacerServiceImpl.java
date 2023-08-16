package net.javaguides.springboot.F1.Service;

import net.javaguides.springboot.F1.Repository.RacerRepository;
import net.javaguides.springboot.F1.entity.Racer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RacerServiceImpl implements RacerService {

    private RacerRepository racerRepository;

//    @Autowired
    public RacerServiceImpl(RacerRepository racerRepository){
        this.racerRepository = racerRepository;
    }

    @Override
    public Racer getRacer(Long rid){
        return racerRepository.findById(rid).get();
    }

    @Override
    public Racer createRacer(Racer racer){
        return racerRepository.save(racer);
    }





}
