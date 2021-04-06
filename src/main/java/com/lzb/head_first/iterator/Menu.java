package com.lzb.design.pattern.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Menu extends MenuComponent {

	ArrayList<MenuComponent> menuComponentLst = new ArrayList<MenuComponent>();
	String name;
	String description;
	public Menu(String name, String description) {
		super();
		this.name = name;
		this.description = description;
	}
	
	public void add(MenuComponent menuComponent) {
		menuComponentLst.add(menuComponent);
	}
	
	public void remove(MenuComponent menuComponent) {
		menuComponentLst.remove(menuComponent);
	}
	
	public MenuComponent getChild(int i) {
		return menuComponentLst.get(i);
	}
	
	public String getName() {
		return name;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void print() {
		System.out.print("name = " + getName() + ";");
		System.out.print("description = " + getDescription());
		System.out.println("----------");
		
		Iterator<MenuComponent> i = menuComponentLst.iterator();
		while(i.hasNext()) {
			i.next().print();
		}
	}
}
