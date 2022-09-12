package com.passenger;

import java.util.Comparator;



public class Passenger implements Comparable<Passenger> {
	private int id;
	private String name;
	private int age;
	private String source;
	private String destination;
	
	public Passenger() {
		
	}

	public Passenger(int id, String name, int age, String source, String destination) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.source = source;
		this.destination = destination;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	@Override
	public int compareTo(Passenger o) {
		// TODO Auto-generated method stub
		return 0;
	}
	class NameCompare implements Comparator<Passenger>{
		public int compare(Passenger s1,Passenger s2) {
		return s1.getName().compareTo(s2.getName());
		}
	}
	

}
