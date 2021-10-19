package Site.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Site.persoana.*;

public class Apartamente_gui extends JFrame{
    protected JTextField Nume;
    protected JTextField Varsta;
    protected JTextField Telefon;
    protected JTextField Email;
    public JPanel Apartamente;
    protected JButton Interesat;
    protected JButton PlatitiAcuma;
    private JButton MainMenu;

    public Apartamente_gui(){

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
                Apartamente.setVisible(false);
                Pay.PannelPlata.setVisible(true);
            }
        });

        MainMenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Apartamente.setVisible(false);
                Home h = new Home();
                h.MyPanel.setVisible(true);
            }
        });
    }

    public static void main(String[] args) {
        JFrame apartamente = new JFrame("Oferta apartament");
        apartamente.setVisible(true);
        apartamente.setContentPane(new Apartamente_gui().Apartamente);
        apartamente.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        apartamente.pack();

    }
}
