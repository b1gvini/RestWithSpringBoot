package br.com.b1gvini.services;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

import br.com.b1gvini.model.Person;

@Service
public class PersonServices {
	private final AtomicLong counter = new AtomicLong();
	
	public Person create(Person person) {
		return person;
	}
	
	public Person update(Person person) {
		return person;
	}
	
	public void delete(String id) {
			
	}
	
	public Person findById(String id) {
		Person person = new Person();
		person.setId(counter.incrementAndGet());
		person.setFistName("Vinícius");
		person.setLastName("De França");
		person.setAddress("Caetés");
		person.setGender("Masculino");
		return person;
	}
	
	public List<Person> findAll(){
		List<Person> persons = new ArrayList<Person>();
		for (int i = 0; i < 8; i++) {
			Person person = mockPerson(i);
			persons.add(person);
		}
		return persons ;
	}

	private Person mockPerson(int i) {
		Person person = new Person();
		person.setId(counter.incrementAndGet());
		person.setFistName("Vinícius" + i);
		person.setLastName("De França" + i);
		person.setAddress("Caetés"+ i);
		person.setGender("Masculino" + i);
		return person;
	}
}
