package hust.soict.dsai.test.disc;

import hust.soict.dsai.aims.media.DigitalVideoDisc;

public class TestOverloading {
	public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
	    for (DigitalVideoDisc dvd : dvdList) {
	        this.addDigitalVideoDisc(dvd);
	    }
	}
	public void addDigitalVideoDisc(DigitalVideoDisc... dvds) {
	    for (DigitalVideoDisc dvd : dvds) {
	        this.addDigitalVideoDisc(dvd);
	    }
	}
	public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
	    this.addDigitalVideoDisc(dvd1);
	    this.addDigitalVideoDisc(dvd2);
	}
}
