package com.xworkz.demo.linkedlists;

public class ItemStarter {
	
	public static void main(String[] args) {

		Item item1 = new ItemContainer();

		Movie movie1 = new Movie("uggram", 2019, 2.5, "Kannada");
		Movie movie2 = new Movie("doctor", 2021, 1.8, "tamil");
		Movie movie3 = new Movie("spiderman", 2021, 3, "English");
		Movie movie4 = new Movie("kurupu", 2021, 2, "malayalam");
		

		item1.addItem(movie1);
		item1.addItem(movie2);
		item1.addItem(movie3);
		item1.addItem(movie4);
		

		item1.displayItem();

		Movie movie5 = new Movie("annathe", 2021, 1.25, "tamil");
		Movie movie6 = new Movie("paramathma", 2015, 3.45, "kannada");
		Movie movie7 = new Movie("u turn", 2019, 5, "kannada");
		Movie movie8 = new Movie("nettrikann", 2020, 4, "tamil");
		

		item1.addFirstItem(movie5);

		item1.getFirstItem();

		item1.addLastItem(movie6);

		item1.deleteFirstItem();

		item1.displayItem();

		item1.addLastItem(movie7);

		item1.addLastItem(movie8);

		item1.deleteLastItem();

		item1.addFirstItem(movie4);

		item1.getFirstItem();

		item1.getLastItem();

		item1.displayItem();


	}

}
 

