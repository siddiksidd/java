package com.vm.java.tests;

import java.awt.List;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Wwe{
	String firstName;
	String lastName;
	int weight;
	public Wwe(String firstName, String lastName, int weight) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.weight = weight;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public int getWeight() {
		return weight;
	}
	@Override
	public String toString() {
		return "Wwe [firstName=" + firstName + ", lastName=" + lastName + ", weight=" + weight + "]";
	}
	
}

public class WweWrestlerImplementation {
static long wrestlersCount(ArrayList<Wwe> wwe) {
	return wwe.stream().count();
	
}





	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Wwe> wwe=new ArrayList<Wwe>();
		wwe.add(new Wwe("john","cena",200));
		wwe.add(new Wwe("mark","henry",350));
		wwe.add(new Wwe("roman","reigns",150));
		wwe.add(new Wwe("great","khali",190));
		wwe.add(new Wwe("shemus","whit",180));
		
		wwe.stream().map(n->n.getFirstName()).forEach(System.out::println);
		System.out.println("Wrestlers Count:"+wrestlersCount(wwe));
		long sum=wwe.stream().collect(Collectors.summarizingInt(Wwe::getWeight)).getSum();
		System.out.println("Sum of wrestelersweight"+sum);
		
	}
}

	
