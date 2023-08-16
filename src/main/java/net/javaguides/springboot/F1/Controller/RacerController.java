package net.javaguides.springboot.F1.Controller;

import net.javaguides.springboot.F1.Service.RacerService;
import net.javaguides.springboot.F1.entity.Racer;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("racer")
public class RacerController {

    private RacerService racerService;

    public RacerController(RacerService racerService){
        this.racerService = racerService;
    }

    @GetMapping("/get/{rid}")
    public ResponseEntity<Racer> getRaceById(@PathVariable Long rid){
        System.out.println("get() .... ");
        return ResponseEntity.ok( this.racerService.getRacer(rid) );
    }

    @PostMapping
    public ResponseEntity<Racer> createRacer(@RequestBody Racer racer){
//        return new ResponseEntity<>(productService.createProduct(product), HttpStatus.CREATED);
        System.out.println("Creating Racer.");
        return new ResponseEntity<>(racerService.createRacer(racer), HttpStatus.CREATED);
    }

}
