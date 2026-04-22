package hust.soict.dsai.aims;

import java.util.Scanner;

import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.media.CompactDisc;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.media.Playable;
import hust.soict.dsai.aims.store.Store;

public class Aims {

    static Scanner sc = new Scanner(System.in);

    public static void showMenu() {
        System.out.println("\nAIMS:");
        System.out.println("1. View store");
        System.out.println("2. Update store");
        System.out.println("3. See current cart");
        System.out.println("0. Exit");
        System.out.print("Choose: ");
    }

    public static void main(String[] args) {

        Store store = new Store();
        Cart cart = new Cart();

        store.addMedia(new Book(1, "Java", "IT", 20f));
        store.addMedia(new DigitalVideoDisc(
                2, "Lion King", "Animation",
                19.95f, 87, "Roger"));

        store.addMedia(new CompactDisc(
                3, "Music CD", "Music",
                25f, 60, "ABC", "Taylor"));

        int choice;

        do {
            showMenu();
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {

            case 1:
                viewStore(store, cart);
                break;

            case 2:
                updateStore(store);
                break;

            case 3:
                viewCart(cart);
                break;

            case 0:
                System.out.println("Goodbye!");
                break;

            default:
                System.out.println("Invalid choice!");
            }

        } while (choice != 0);
    }

    public static void viewStore(Store store, Cart cart) {

        int choice;

        do {
            store.print();

            System.out.println("\n1. See media details");
            System.out.println("2. Add media to cart");
            System.out.println("3. Play media");
            System.out.println("4. See current cart");
            System.out.println("0. Back");
            System.out.print("Choose: ");

            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {

            case 1:
                System.out.print("Enter title: ");
                String title = sc.nextLine();

                Media m = store.search(title);

                if (m != null)
                    System.out.println(m);
                else
                    System.out.println("Not found");

                break;

            case 2:
                System.out.print("Enter title: ");
                title = sc.nextLine();

                m = store.search(title);

                if (m != null)
                    cart.addMedia(m);

                break;

            case 3:
                System.out.print("Enter title: ");
                title = sc.nextLine();

                m = store.search(title);

                if (m instanceof Playable)
                    ((Playable) m).play();
                else
                    System.out.println("Cannot play");

                break;

            case 4:
                cart.print();
                break;
            }

        } while (choice != 0);
    }

    public static void updateStore(Store store) {

        System.out.println("\n1. Add Book");
        System.out.println("2. Remove media");
        System.out.print("Choose: ");

        int c = Integer.parseInt(sc.nextLine());

        if (c == 1) {
            System.out.print("Enter title: ");
            String title = sc.nextLine();

            store.addMedia(new Book(100, title, "Unknown", 10f));
        }

        if (c == 2) {
            System.out.print("Enter title: ");
            String title = sc.nextLine();

            Media m = store.search(title);

            if (m != null)
                store.removeMedia(m);
        }
    }

    public static void viewCart(Cart cart) {

        int choice;

        do {
            cart.print();

            System.out.println("\n1. Sort by title");
            System.out.println("2. Sort by cost");
            System.out.println("0. Back");
            System.out.print("Choose: ");

            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {

            case 1:
                cart.sortByTitle();
                break;

            case 2:
                cart.sortByCost();
                break;
            }

        } while (choice != 0);
    }
}