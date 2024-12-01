package hust.soict.dsai.test.store;

import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.store.Store;

public class StoreTest {
    public static void main(String[] args) {
        // Create a Store instance
        Store store = new Store();

        // Create some DVD instances
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("Inception", "Science Fiction", "Christopher Nolan", 148, 19.99f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Interstellar", "Science Fiction", "Christopher Nolan", 169, 24.99f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("The Matrix", "Action", "Wachowskis", 136, 14.99f);
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("Avatar", "Fantasy", "James Cameron", 162, 22.50f);

        store.addMedia(dvd3, dvd2);
        store.print();
        store.removeMedia(dvd3);
        store.removeMedia(dvd3);
        
        store.print();
        
    }
}
