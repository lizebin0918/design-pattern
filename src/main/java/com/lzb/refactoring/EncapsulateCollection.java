package com.lzb.refactoring;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 * 封装集合<br/>
 * Created on : 2022-12-14 21:50
 * @author mac
 */
public class EncapsulateCollection {

	private static class Person {
		private final String name;
		private final int age;

		private Person(String name, int age) {
			this.name = name;
			this.age = age;
		}

		@Override
		public boolean equals(Object o) {
			if (this == o) return true;
			if (!(o instanceof Person)) return false;
			Person person = (Person) o;
			return age == person.age && Objects.equals(name, person.name);
		}

		@Override
		public int hashCode() {
			return Objects.hash(name, age);
		}
	}

	private static class Developer {
		private List<Person> persons = new ArrayList<>();
		public List<Person> getPersons() {
			return Collections.unmodifiableList(persons);
		}
		public void addPerson(Person person) {
			persons.add(person);
		}
		public void removePerson(Person person) {
			persons.remove(person);
		}

	}

}
