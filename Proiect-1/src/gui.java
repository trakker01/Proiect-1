
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.Vector;
import chirias.persoana.ContBancar;
import chirias.persoana.User;

public class gui {
    private JButton ApartamenteButton;
    private JButton GarsoniereButton;
    private JButton CamereButton;
    private JButton AdaugatiOferteButton;
    private JPanel MyPanel;

    public gui() {
        ApartamenteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent y) {
                int a=0;
                Vector<String> Apartamente_V = new Vector<>();
                try {
                    File Lista_apartamente = new File("D:\\Programare pe obiecte\\Proiect-1\\Proiect-1\\src\\Apartamente.txt");

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

        GarsoniereButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent z) {


            }
        });

        CamereButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent w) {


            }
        });

        AdaugatiOferteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent x) {


            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Cool frame");
        frame.setContentPane(new gui().MyPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
