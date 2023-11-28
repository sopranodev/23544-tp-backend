package ar.com.codoacodo.entity;

import java.time.LocalDate;

public class MainOrador {

	public static void main(String[] args) {
		//Creo el objeto Orador
		Orador nuevoOrador = new Orador("Cecilia", "Arone", "ceciliagrisel@gmail.com", "Criptografía en PLC", LocalDate.now());
		System.out.println(nuevoOrador);
	}

}
