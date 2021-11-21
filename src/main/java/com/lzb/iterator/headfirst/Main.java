package com.lzb.iterator.headfirst;

public class Main {

	public static void main(String[] args) {
		MenuComponent m = new Menu("M", "breastfast");
		MenuComponent kfc = new Menu("kfc", "lunch");
		MenuComponent starBucks = new Menu("starBucks", "coffee");
		
		MenuComponent allMenus = new Menu("ALL Menus", "ALL menus combined");
		allMenus.add(m);
		allMenus.add(kfc);
		allMenus.add(starBucks);

		MenuComponent hamburgerMenu = new Menu("汉堡", "各种汉堡");
		m.add(hamburgerMenu);
		hamburgerMenu.add(new MenuItem("照烧鸡腿堡", "照烧鸡腿堡", false, 10D));
		hamburgerMenu.add(new MenuItem("炸鸡腿堡", "炸烧鸡腿堡", false, 10D));


		m.add(new MenuItem("炸鸡", "香辣鸡腿", false, 3.83D));
		m.add(new MenuItem("雪糕", "圆筒雪糕", false, 4D));
		kfc.add(new MenuItem("全家桶", "鸡翅集合", false, 110D));
		starBucks.add(new MenuItem("咖啡", "拿铁", false, 50D));
		
		Waitress waitress = new Waitress(allMenus);
		waitress.printMenu();
		
	}
}
