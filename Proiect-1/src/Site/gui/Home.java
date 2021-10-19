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
    private JButton CamereButton;
    private JButton AdaugatiOferteButton;
    protected JPanel MyPanel;
    private JButton Apartament_alg;
    private JButton Garsoniera_alg;
    private JButton Camera_alg;

    public Home() {

        Apartamente_gui apart_gui = new Apartamente_gui();

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
                for (int i = a; i < Apartamente_V.size(); i++) {
                    System.out.println(i + ". " + Apartamente_V.get(i) + " ");
                    a++;
                }

            }
        });

        Apartament_alg.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                    MyPanel.setVisible(false);
                    //Apartamente_gui apart_gui = new Apartamente_gui();
                    apart_gui.Apartamente.setVisible(true);
            }
        });
        apart_gui.Apartamente.setVisible(false);
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
                for (int i = g; i < Garsoniera_V.size(); i++) {
                    System.out.println(Garsoniera_V.get(i) + " ");
                    g++;
                }
            }
        });

        Garsoniera_alg.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                MyPanel.setVisible(false);
                Apartamente_gui apart_gui = new Apartamente_gui();
                apart_gui.Apartamente.setVisible(true);

            }
        });

        CamereButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent w) {
                int c = 0;
                Vector<String> Camera_V = new Vector<>();

                try {
                    File Lista_camera = new File("D:\\Programare pe obiecte\\Proiect-1\\Proiect-1\\src\\Site\\oferte\\Camera.txt");

                    Scanner sl = new Scanner(Lista_camera);

                    while (sl.hasNextLine()) {
                        Camera_V.add(sl.nextLine());
                    }
                } catch (IOException e) {
                    System.out.println("A aparut o eroare cu lista de oferte. ");
                    e.printStackTrace();
                }
                for (int i = c; i < Camera_V.size(); i++) {
                    System.out.println(i + "." + Camera_V.get(i) + " ");
                    c++;
                }
            }
        });

        AdaugatiOferteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent x) {


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
