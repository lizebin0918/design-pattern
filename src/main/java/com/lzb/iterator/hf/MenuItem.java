package com.lzb.iterator.hf;

public class MenuItem extends MenuComponent {

	String name;
	String description;
	Boolean vegetarian;
	Double price;
	public MenuItem(String name, String description, Boolean vegetarian,
			Double price) {
		super();
		this.name = name;
		this.description = description;
		this.vegetarian = vegetarian;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public String getDescription() {
		return description;
	}
	public Boolean isVegetarian() {
		return vegetarian;
	}
	public Double getPrice() {
		return price;
	}
	public void print() {
		System.out.print("name = " + getName());
		if(isVegetarian()) {
			System.out.print("(v)");
		}
		System.out.println(", price = " + getPrice());
		System.out.println(" --" + getDescription());
	}
	
}
