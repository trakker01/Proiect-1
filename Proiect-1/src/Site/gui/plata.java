package Site.gui;

import java.awt.event.*;
import javax.swing.*;
import Site.persoana.*;

public class plata {
    private JTextField NumeCard;
    private JTextField NumarCar;
    private JTextField LunaExpirare;
    private JTextField AnExpirare;
    private JTextField CVC;
    private JTextArea SoldTotal;
    protected JPanel PannelPlata;
    private JButton Finalizat;

    public plata(){
        Finalizat.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent y) {
                ContBancar cont = new ContBancar();
                cont.FullName(NumeCard.getText());
                cont.NumberCard(NumarCar.getText());
                String s;
                s = AnExpirare.getText();
                Integer i = Integer.valueOf(s);
                cont.Year(i);
                s = LunaExpirare.getText();
                Integer i1 = Integer.valueOf(s);
                cont.Month(i1);
                s = SoldTotal.getText();
                Integer i2 = Integer.valueOf(s);
                cont.Sold(i2);
                cont.CVC(CVC.getText());

                PannelPlata.setVisible(false);
                Home h = new Home();
                h.MyPanel.setVisible(true);
            }
        });

    }
    public static void main(String[] args) {
        JFrame PannelPlata = new JFrame("Plata");
        PannelPlata.setVisible(true);
        PannelPlata.setContentPane(new plata().PannelPlata);
        PannelPlata.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        PannelPlata.pack();

    }
}
