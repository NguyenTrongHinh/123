package hust.soict.hedspi.aims.cart;
import hust.soict.hedspi.aims.disc.DigitalVideoDisc;
public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private DigitalVideoDisc[] dvds;
    private int qtyOrdered;
  
    public Cart() {
        dvds = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
        qtyOrdered = 0;
    }
  
    // Add a DVD to the cart
    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered < MAX_NUMBERS_ORDERED) {
            dvds[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("NTH-The DVD \"" + disc.getTitle() + "\" has been successfully added to the cart.");
        } else {
            System.out.println("NTH-The cart is full.");
        }
    }
  
    // Remove a DVD from the cart
    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        for (int i = 0; i < qtyOrdered; i++) {
            if (dvds[i].equals(disc)) {
                for (int j = i; j < qtyOrdered - 1; j++) {
                    dvds[j] = dvds[j + 1];
                }
                dvds[qtyOrdered - 1] = null;
                qtyOrdered--;
                System.out.println("NTH-The disc \"" + disc.getTitle() + "\" has been removed from the cart.");
                return;
            }
        }
        System.out.println("NTH-DVD not found in the cart.");
    }
  
    // Calculate the total cost of DVDs in the cart
    public float totalCost() {
        float totalCost = 0;
        for (int i = 0; i < qtyOrdered; i++) {
            totalCost += dvds[i].getCost();
        }
        return totalCost;
    }
  
    // Print the list of DVDs in the cart along with their costs
    public void print() {
        System.out.println("NTH-Cart contents: ");
        for (int i = 0; i < qtyOrdered; i++) {
            System.out.println(dvds[i].getTitle() + " - $" + dvds[i].getCost());
        }
        System.out.println("NTH-Total cost: $" + totalCost());
    }
    public void searchById(int i) {
        if(i > qtyOrdered) {
            System.out.println("No match found !");
        } else {
            System.out.println("Result: " +  "[" + dvds[i-1].getTitle() +
                    "] - [" + dvds[i-1].getCategory() + "] - ["
                    + dvds[i-1].getDirector() + "] - ["
                    + dvds[i-1].getLength() + "]: " +dvds[i-1].getCost() + " $\n");
        }

    }

    public void searchByTitle(String title) {
        for(int i = 0;i < qtyOrdered; i++) {
            if(dvds[i].getTitle().equals(title)) {
                System.out.println("Result: " +  "[" + dvds[i].getTitle() +
                        "] - [" + dvds[i].getCategory() + "] - ["
                        + dvds[i].getDirector() + "] - ["
                        + dvds[i].getLength() + "]: " +dvds[i].getCost() + " $\n");
                return;
            }
        }
        System.out.println("No match found !");
    }
}
