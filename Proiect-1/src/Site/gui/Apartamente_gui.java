package Site.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.io.IOException;
import java.util.Scanner;
import java.util.Vector;

import Site.oferte.Site;
import Site.persoana.*;

public class Apartamente_gui extends JFrame {
    protected JTextField Nume;
    protected JTextField Varsta;
    protected JTextField Telefon;
    protected JTextField Email;
    public JPanel Apartamente;
    public JButton Interesat;
    protected JButton PlatitiAcuma;
    private JButton MainMenu;
    private JTextField Oferta;

    public Apartamente_gui() {

        int a = 0;
        Vector<String> Apartamente_V = new Vector<>();
        try {
            File Lista_apartamente = new File("D:\\Programare pe obiecte\\Proiect-1\\Proiect-1\\src\\Site\\oferte\\Apartamente.txt");

            Scanner sl = new Scanner(Lista_apartamente);

            while (sl.hasNextLine()) {
                Apartamente_V.add(sl.nextLine());
                ++a;
            }
        } catch (IOException e) {
            System.out.println("A aparut o eroare cu list de oferte. ");
            e.printStackTrace();
        }

        plata Pay = new plata();
        Site site = new Site();

        Interesat.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String l = Oferta.getText();
                Integer o = Integer.valueOf(l);
                User user = new User();
                user.FullName(Nume.getText());
                String y = Varsta.getText();
                Integer v = Integer.valueOf(y);
                user.isMajor(v);
                user.AccountMail(Email.getText());
                user.PhoneNumber(Telefon.getText());
                String User = Varsta.getText() + Nume.getText() + Telefon.getText()
                site.appendStrtoFile("D:\\Programare pe obiecte\\Proiect-1\\Proiect-1\\src\\Site\\oferte\\User.txt", );
            }
        });

        PlatitiAcuma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                User user = new User();
                user.FullName(Nume.getText());
                String y = Varsta.getText();
                Integer v = Integer.valueOf(y);
                user.isMajor(v);
                user.AccountMail(Email.getText());
                user.PhoneNumber(Telefon.getText());
                String l = Oferta.getText();
                Integer o = Integer.valueOf(l);
                Apartamente_V.get(o);
                site.delete("D:\\Programare pe obiecte\\Proiect-1\\Proiect-1\\src\\Site\\oferte\\Apartamente.txt", 0, Apartamente_V.size(), o);
                Apartamente.setVisible(false);
                Pay.PannelPlata.setVisible(true);

            }
        });

        MainMenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Home h = new Home();
                h.MyPanel.setVisible(true);
                Apartamente.setVisible(false);

            }
        });
        Apartamente.setVisible(true);
    }

    /*public static void main(String[] args) {
        JFrame Apartamente_l = new JFrame("Apartamente Oferte");
        Apartamente_l.setContentPane(new Apartamente_gui().Apartamente);
        Apartamente_l.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Apartamente_l.pack();
        Apartamente_l.setVisible(true);
    }*/
}
