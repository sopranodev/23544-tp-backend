package ar.com.codoacodo.repository;

import java.time.LocalDate;

import ar.com.codoacodo.entity.Orador;

public class MainOradorRepository {

	 public static void main(String[] args) {
		
		 //Interface i = new ClaseQueImplementa();
		 OradorRepository repository = new MySqlOradorRepository();
		 
//		 Orador newOrador = new Orador("carlos", "lopez", "email@email.com", "java", LocalDatetime.now());
//		 repository.save(newOrador);
		 
		// repository.save(new Orador);
		 
		 Orador newOrador = repository.getById(3L);
		 System.out.println(newOrador);
	}
}