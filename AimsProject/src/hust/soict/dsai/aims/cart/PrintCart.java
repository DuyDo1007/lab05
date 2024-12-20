package hust.soict.dsai.aims.cart;

import hust.soict.dsai.aims.media.DigitalVideoDisc;

public class PrintCart {
	private DigitalVideoDisc[] items = new DigitalVideoDisc[20];
	private int qtyOrdered = 0;
	public void print() {
	    System.out.println("***********************CART***********************");
	    System.out.println("Ordered Items:");
	    for (int i = 0; i < qtyOrdered; i++) {
	        System.out.println((i + 1) + ". " + items[i].toString());
	    }
	    System.out.println("Total cost: " + totalCost() + "$");
	    System.out.println("***************************************************");
	}
}
