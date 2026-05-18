package hust.soict.dsai.aims.screen.manager;

import java.awt.*;
import javax.swing.*;

import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.media.Playable;

public class MediaStore extends JPanel {

    private Media media;

    public MediaStore(Media media) {

        this.media = media;

        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        JLabel title = new JLabel(media.getTitle());

        title.setFont(new Font(title.getFont().getName(),
                Font.PLAIN, 15));

        title.setAlignmentX(CENTER_ALIGNMENT);

        JLabel cost = new JLabel(media.getCost() + " $");
        cost.setAlignmentX(CENTER_ALIGNMENT);

        add(Box.createVerticalGlue());
        add(title);
        add(cost);
        add(Box.createVerticalGlue());

        JPanel container = new JPanel();

        if (media instanceof Playable) {

            JButton playButton = new JButton("Play");

            playButton.addActionListener(e -> {

                JOptionPane.showMessageDialog(
                        null,
                        "Playing: " + media.getTitle()
                );

                ((Playable) media).play();
            });

            container.add(playButton);
        }

        JButton addToCartButton = new JButton("Add to cart");

        container.add(addToCartButton);

        add(container);

        setBorder(BorderFactory.createLineBorder(Color.BLACK));
    }
}