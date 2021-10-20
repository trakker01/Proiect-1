package Site.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Site.oferte.*;

public class adaugare {
    Site site = new Site();

    private JTextField Pretul;
    private JTextField Strada;
    private JTextField Marime;
    private JTextField Camere;
    private JTextField telefon;
    private JButton Apartament_1;
    private JButton Garsoniera_1;
    protected JPanel Adauga;

    public adaugare() {
        Apartament_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int t = 1;
                String Oferta = "Apartament la pretul de " + Pretul.getText()  + " euro cu adresa urmatoare: " + Strada.getText() + " cu marimea de " + Marime.getText()  + " metri patrati cu " + Camere.getText() + " camere. Contact la numarul de telefon urmator: " + telefon.getText() + ".";

                site.appendStrtoFile("D:\\Programare pe obiecte\\Proiect-1\\Proiect-1\\src\\Site\\oferte\\Apartamente.txt", Oferta);

            }
        });

        Garsoniera_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int t = 2;
                String Oferta = "Garsoniera la pretul de " + Pretul.getText()  + " euro cu adresa urmatoare: " + Strada.getText() + " cu marime de  " + Marime.getText() + " metri patrati. Contact la numarul de telefon urmator: " + telefon.getText() + ".";

                site.appendStrtoFile("D:\\Programare pe obiecte\\Proiect-1\\Proiect-1\\src\\Site\\oferte\\Garsoniera.txt", Oferta);
            }
        });
    }

    public static void main(String[] args) {
        JFrame jframe = new JFrame("Adauga oferta");
        jframe.setVisible(true);
        jframe.setContentPane(new adaugare().Adauga);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.pack();
    }
}
