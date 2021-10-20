package Site.gui;

import java.awt.event.*;
import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.Vector;

public class Home {
    private JButton ApartamenteButton;
    private JButton GarsoniereButton;
    private JButton AdaugatiOferteButton;
    protected JPanel MyPanel;
    private JButton Apartament_alg;
    private JButton Garsoniera_alg;

    public Home() {

        //Apartamente_gui apart_gui = new Apartamente_gui();
        //Cod_scris_apart stock = new Cod_scris_apart();

        ApartamenteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent y) {
                int a = 0;
                Vector<String> Apartamente_V = new Vector<>();
                try {
                    File Lista_apartamente = new File("D:\\Programare pe obiecte\\Proiect-1\\Proiect-1\\src\\Site\\oferte\\Apartamente.txt");

                    Scanner sl = new Scanner(Lista_apartamente);

                    while (sl.hasNextLine()) {
                        Apartamente_V.add(sl.nextLine());
                    }
                } catch (IOException e) {
                    System.out.println("A aparut o eroare cu list de oferte. ");
                    e.printStackTrace();
                }
                System.out.println("Ofertele de Apartamente");
                for (int i = a; i < Apartamente_V.size(); i++) {
                    System.out.println(i + ". " + Apartamente_V.get(i) + " ");
                    a++;
                }
                System.out.println("\n\n");
            }
        });

        Apartament_alg.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource().equals(Apartament_alg)) {

                    Apartamente_gui apart_gui = new Apartamente_gui();
                    apart_gui.Apartamente.setVisible(true);
                    Cod_scris_apart stock = new Cod_scris_apart();
                }
            }
        });
        // apart_gui.Apartamente.setVisible(false);
        MyPanel.setVisible(true);

        GarsoniereButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent z) {
                int g = 0;
                Vector<String> Garsoniera_V = new Vector<>();

                try {
                    File Lista_garsoniera = new File("D:\\Programare pe obiecte\\Proiect-1\\Proiect-1\\src\\Site\\oferte\\Garsoniera.txt");

                    Scanner sl = new Scanner(Lista_garsoniera);

                    while (sl.hasNextLine()) {
                        Garsoniera_V.add(sl.nextLine());
                    }
                } catch (IOException e) {
                    System.out.println("A aparut o eroare cu lista de oferte. ");
                    e.printStackTrace();
                }
                System.out.println("Ofertele de garsoniera");
                for (int i = g; i < Garsoniera_V.size(); i++) {
                    System.out.println(Garsoniera_V.get(i) + " ");
                    g++;
                }
                System.out.println("\n\n");
            }


        });

        Garsoniera_alg.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                MyPanel.disable();
                Garsoniera_gui gars = new Garsoniera_gui();
                gars.PanelG.setVisible(true);
            }
        });
        AdaugatiOferteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent x) {

                MyPanel.setVisible(false);
                adaugare adauga = new adaugare();
                adauga.Adauga.setVisible(true);
            }
        });
    }

    public static void main(String[] args) {
        JFrame MyPanel = new JFrame("Oferte chirie");
        MyPanel.setContentPane(new Home().MyPanel);
        MyPanel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MyPanel.pack();
        MyPanel.setVisible(true);
    }
}
