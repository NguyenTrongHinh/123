package hust.soict.hedspi.aims.store;

public class Aims {
	public static void main(String [] args) {
		Cart anOrder = new Cart();

		DigitalVideoDisc dvd1 = new DigitalVideoDisc("One Piece", "Anime", "Oda", 148, 29.5f);
		anOrder.addDigitalVideoDisc(dvd1);

		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Songoku", "Action", "Toriyama", 136, 19.0f);
		anOrder.addDigitalVideoDisc(dvd2);

		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Naruto", "Anime", "Kishimoto", 169, 24.5f);
		anOrder.addDigitalVideoDisc(dvd3);

		System.out.println("NTH-Total cost is: ");
		System.out.println(anOrder.totalCost());

		anOrder.removeDigitalVideoDisc(dvd2);
		
		System.out.println("NTH-Total cost is: ");
		System.out.println(anOrder.totalCost());
	}
}
