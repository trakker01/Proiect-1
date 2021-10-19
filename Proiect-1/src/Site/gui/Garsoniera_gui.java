package Site.gui;

import java.awt.event.*;
import javax.swing.*;

import Site.oferte.Garsoniera;
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

    public Garsoniera_gui(){

        plata Pay = new plata();

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
                PanelG.setVisible(false);
                Pay.PannelPlata.setVisible(true);
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
