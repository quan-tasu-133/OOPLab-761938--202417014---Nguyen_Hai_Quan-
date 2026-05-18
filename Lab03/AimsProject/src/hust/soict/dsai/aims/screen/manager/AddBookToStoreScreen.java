package hust.soict.dsai.aims.screen.manager;

import javax.swing.*;

public class AddBookToStoreScreen extends JFrame {

    public AddBookToStoreScreen() {

        setTitle("Add Book");

        add(new JLabel("Add Book Screen"));

        setSize(400, 200);

        setVisible(true);

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}