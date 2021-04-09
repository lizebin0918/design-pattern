package com.lzb.head_first.iterator;

public class Waitress {

	MenuComponent allMenus;
	public Waitress(MenuComponent allMenus) {
		this.allMenus = allMenus;
	}
	public void printMenu() {
		allMenus.print();
	}
	
}
