package hust.soict.dsai.aims.screen.manager;

import java.awt.*;
import javax.swing.*;

import hust.soict.dsai.aims.media.*;
import hust.soict.dsai.aims.store.Store;

public class StoreManagerScreen extends JFrame {

    private Store store;

    public StoreManagerScreen(Store store) {

        this.store = store;

        Container cp = getContentPane();
        cp.setLayout(new BorderLayout());

        cp.add(createNorth(), BorderLayout.NORTH);
        cp.add(createCenter(), BorderLayout.CENTER);

        setTitle("Store");
        setSize(1024, 768);
        setVisible(true);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    JPanel createNorth() {

        JPanel north = new JPanel();
        north.setLayout(new BoxLayout(north, BoxLayout.Y_AXIS));

        north.add(createMenuBar());
        north.add(createHeader());

        return north;
    }

    JMenuBar createMenuBar() {

        JMenu menu = new JMenu("Options");

        JMenu smUpdateStore = new JMenu("Update Store");

        JMenuItem addBook = new JMenuItem("Add Book");
        JMenuItem addCD = new JMenuItem("Add CD");
        JMenuItem addDVD = new JMenuItem("Add DVD");
        
        addBook.addActionListener(e -> {
            new AddBookToStoreScreen();
        });

        addCD.addActionListener(e -> {
            new AddCompactDiscToStoreScreen();
        });

        addDVD.addActionListener(e -> {
            new AddDigitalVideoDiscToStoreScreen();
        });

        smUpdateStore.add(addBook);
        smUpdateStore.add(addCD);
        smUpdateStore.add(addDVD);

        menu.add(smUpdateStore);

        JMenuBar menuBar = new JMenuBar();
        menuBar.setLayout(new FlowLayout(FlowLayout.LEFT));

        menuBar.add(menu);

        return menuBar;
    }

    JPanel createHeader() {

        JPanel header = new JPanel();
        header.setLayout(new BoxLayout(header, BoxLayout.X_AXIS));

        JLabel title = new JLabel("AIMS");

        title.setFont(new Font(title.getFont().getName(),
                Font.PLAIN, 50));

        title.setForeground(Color.CYAN);

        header.add(Box.createRigidArea(new Dimension(10, 10)));
        header.add(title);
        header.add(Box.createHorizontalGlue());

        return header;
    }

    JPanel createCenter() {

        JPanel center = new JPanel();

        center.setLayout(new GridLayout(3, 3, 2, 2));

        for (Media media : store.getItemsInStore()) {

            MediaStore cell = new MediaStore(media);

            center.add(cell);
        }

        return center;
    }

    public static void main(String[] args) {

        Store store = new Store();

        store.addMedia(new Book(
                1,
                "Book 1",
                "Category",
                20.5f
        ));

        store.addMedia(new DigitalVideoDisc(
                2,
                "DVD 1",
                "Category",
                15.0f,
                120,
                "Director"
        ));

        store.addMedia(new CompactDisc(
                3,
                "CD 1",
                "Category",
                10.0f,
                60,
                "Director",
                "Artist"
        ));

        new StoreManagerScreen(store);
    }
}