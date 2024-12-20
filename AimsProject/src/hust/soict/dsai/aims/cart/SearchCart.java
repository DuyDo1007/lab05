package hust.soict.dsai.aims.cart;

import hust.soict.dsai.aims.media.DigitalVideoDisc;

public class SearchCart {
	public void searchByTitle(String title) {
		private DigitalVideoDisc[] items = new DigitalVideoDisc[20];
		private int qtyOrdered = 0;
	    boolean found = false;
	    System.out.println("Searching for DVDs with title: " + title);
	    for (int i = 0; i < qtyOrdered; i++) {
	        if (items[i].isMatch(title)) {
	            System.out.println((i + 1) + ". " + items[i].toString());
	            found = true;
	        }
	    }
	    if (!found) {
	        System.out.println("No DVDs found with the title \"" + title + "\".");
	    }
	}
}
