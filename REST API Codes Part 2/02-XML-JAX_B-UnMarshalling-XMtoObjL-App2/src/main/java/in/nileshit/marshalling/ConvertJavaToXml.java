package in.nileshit.marshalling;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import in.nileshit.bindings.Address;
import in.nileshit.bindings.Person;

public class ConvertJavaToXml {

	public static void main(String[] args) throws Exception {

		Address addr = new Address();
		addr.setCity("Nampur");
		addr.setState("Maharshtra");
		addr.setCountry("India");

		Person person = new Person();
		person.setId(101);
		person.setName("Nilesh");
		person.setAge(28);
		person.setPhno(12575757l);
		person.setAdress(addr);

		JAXBContext instance = JAXBContext.newInstance(Person.class);

		Marshaller marshaller = instance.createMarshaller();

		marshaller.marshal(person, new File("Person.xml"));

		System.out.println("Marshalling Completed....");
	}
}
