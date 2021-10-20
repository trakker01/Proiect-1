package Site.gui;

import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.Vector;

public class Cod_scris_apart extends JFrame {

    protected JPanel f;
    protected JTextField text;

    public Cod_scris_apart() {

        JFrame f = new JFrame("A JFrame");
        f.setSize(250, 250);
        f.setLocation(300, 200);
        final JTextArea textArea = new JTextArea(10, 40);
        f.getContentPane().add(BorderLayout.CENTER, textArea);
        final JButton button = new JButton("Click Me");
        f.getContentPane().add(BorderLayout.SOUTH, button);
        f.setVisible(true);
        button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                int a = 0;
                Vector<String> Apartamente_V = new Vector<>();
                try {
                    File Lista_apartamente = new File("D:\\Programare pe obiecte\\Proiect-1\\Proiect-1\\src\\Site\\oferte\\Apartamente.txt");

                    Scanner sl = new Scanner(Lista_apartamente);

                    while (sl.hasNextLine()) {
                        Apartamente_V.add(sl.nextLine());
                        ++a;
                    }
                } catch (IOException y) {
                    System.out.println("A aparut o eroare cu list de oferte. ");
                    y.printStackTrace();
                }

            }
        });


    }
}
