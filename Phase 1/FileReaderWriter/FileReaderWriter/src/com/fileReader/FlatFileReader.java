package com.fileReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import com.datacontainers.Address;
import com.datacontainers.Person;

public class FlatFileReader {
	
	public ArrayList<Person> readPersons() {
	Scanner sc = null;
		
		try {
			sc = new Scanner(new File("data/Persons.dat"));
			sc.nextLine(); // reads the number of records from the first line
			
			// This Person ArrayList stores the Person objects 
			ArrayList<Person> personList = new ArrayList<Person>();
			
			while(sc.hasNext()) {
				String line = sc.nextLine(); // reads each line starting from 2nd line
				String data[] = line.split(";"); // tokenizes the line and stores in a tring array 
				
				// Stores the 4 array elements of each line into strings
				String lastName = data[0];
				String firstName = data[1];
				String city = data[2];
				String state = data[3];
				
				// Creates an Address object
				Address address = new Address(city, state);
				
				// Creates a Person object
				Person person = new Person(lastName, firstName, address);
				
				// Adds the Person object into Person ArrayList
				personList.add(person);
			}
			sc.close();
			return personList;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return null;
		}	
	}
}

