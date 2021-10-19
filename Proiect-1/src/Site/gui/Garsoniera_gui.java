package Site.gui;

import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.Vector;
import javax.swing.*;

import Site.oferte.Garsoniera;
import Site.oferte.Site;
import Site.persoana.*;

public class Garsoniera_gui {
    private JTextField Nume;
    private JTextField Varsta;
    private JTextField Telefon;
    private JTextField Email;
    private JButton Interesat;
    private JButton PlatitiAcuma;
    protected JPanel PanelG;
    private JButton MainMenu;
    private JTextField Oferta;

    public Garsoniera_gui(){

        plata Pay = new plata();
        Site site = new Site();

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

        Interesat.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                User user = new User();
                user.FullName(Nume.getName());
                String y = Varsta.getName();
                Integer v = Integer.valueOf(y);
                user.isMajor(v);
                user.AccountMail(Email.getName());
                user.PhoneNumber(Telefon.getName());
            }
        });

        PlatitiAcuma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                User user = new User();
                user.FullName(Nume.getName());
                String y = Varsta.getName();
                Integer v = Integer.valueOf(y);
                user.isMajor(v);
                user.AccountMail(Email.getName());
                user.PhoneNumber(Telefon.getName());
                String l = Oferta.getName();
                Integer o = Integer.valueOf(l);
                PanelG.setVisible(false);
                Pay.PannelPlata.setVisible(true);
                Garsoniera_V.get(o);
                site.delete("D:\\Programare pe obiecte\\Proiect-1\\Proiect-1\\src\\Site\\oferte\\Garsoniera.txt",0, Garsoniera_V.size(), o);
            }
        });

        MainMenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                PanelG.setVisible(false);
                Home h = new Home();
                h.MyPanel.setVisible(true);
            }
        });
    }

    public static void main(String[] args) {
        JFrame PanelG = new JFrame("Oferta garsoniera");
        PanelG.setVisible(true);
        PanelG.setContentPane(new Garsoniera_gui().PanelG);
        PanelG.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        PanelG.pack();

    }
}
