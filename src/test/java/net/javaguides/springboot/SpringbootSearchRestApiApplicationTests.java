package net.javaguides.springboot;

import net.javaguides.springboot.F1.Repository.RacerRepository;
import net.javaguides.springboot.F1.entity.Racer;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringbootSearchRestApiApplicationTests {

	@Autowired
	private RacerRepository racerRepository;

	@Test
	void saveOneRecord() {
//		private int car_no;
//		private String driver;
//		private String team;
		Racer r = new Racer();
		r.setRid(16L);
		r.setDriver("Leclare");
		r.setTeam("Ferrari");

		Racer rr   = racerRepository.save(r);
		System.out.println(rr.toString());
	}

	@Test
	void updateRacer(){
		Racer r = racerRepository.findById(3L).get();
		r.setCar_no(16);
		racerRepository.save(r);
	}

	@Test
	void findAllRacers(){
		List<Racer> l = racerRepository.findAll();
		l.forEach((ra)->{
			System.out.println(ra.getDriver());
		});
	}

	@Test
	void countRacer(){
		Long c = racerRepository.count();

			System.out.println("Number of racers: "+c);
	}

	@Test
	void checkRacer(){
		boolean r1 = racerRepository.existsById(4L);
		boolean r2 = racerRepository.existsById(2L);
		System.out.println(r1 +"  :  "+ r2);
	}

	@Test
	void deleteOne(){
//		racerRepository.deleteById(4L);
		racerRepository.deleteById(1L);
	}

	@Test
	void deleteList(){
//		racerRepository.deleteById(4L);
		Racer r1= racerRepository.findById(2L).get();
		Racer r2 = racerRepository.findById(3L).get();

		racerRepository.deleteAll(List.of(r1, r2));
	}




}
