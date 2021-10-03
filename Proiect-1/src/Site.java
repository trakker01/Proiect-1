import java.lang.String;
import java.util.Scanner;
import java.util.Vector;
import java.io.File;
import java.io.IOException;

public class Site
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int price, room, meter, number;
        int n = 0;
        String address;

        Vector<String> Apartamente_V = new Vector<String>();
        Vector<String> Garsoniera_V = new Vector<String>();
        Vector<String> Camera_V = new Vector<String>();

        Apartament apart = new Apartament();

        char access_menu = 'y';
        while (access_menu == 'y' || access_menu == 'Y')
        {   System.out.println("Bine ati venit pe site-ul de chirii. Tastati numarul respctiv pentru meniu-ul care doriti sa accesati ");
            System.out.println("1.Apartamente");
            System.out.println("2.Garsoniera");
            System.out.println("3.Camera");
            System.out.println("4.Adauga oferta");

            int Menu_number = sc.nextInt();

            if (Menu_number == 1)
            {
                try {
                File Lista_apartamente = new File("D:\\Programare pe obiecte\\Proiect-1\\Proiect-1\\src\\Apartamente.txt");

                Scanner sl = new Scanner(Lista_apartamente);

                while(sl.hasNextLine())
                {
                    Apartamente_V.add(sl.nextLine());
                    n++;
                }
            } catch (IOException e) {
                System.out.println("A aparut o eroare cu list de oferte. ");
                e.printStackTrace();
            }

                for (int i = 0; i < Apartamente_V.size(); i++)
                    System.out.println(Apartamente_V.get(i) + " ");

            }    else
            if (Menu_number == 2)
            {
                try {
                    File Lista_garsoniera = new File("D:\\Programare pe obiecte\\Proiect-1\\Proiect-1\\src\\Garsoniera.txt");

                    Scanner sl = new Scanner(Lista_garsoniera);

                    while(sl.hasNextLine())
                    {
                        Apartamente_V.add(sl.nextLine());
                        n++;
                    }
                } catch (IOException e) {
                    System.out.println("A aparut o eroare cu list de oferte. ");
                    e.printStackTrace();
                }

                for (int i = 0; i < Apartamente_V.size(); i++)
                    System.out.println(Apartamente_V.get(i) + " ");

            }    else
            if (Menu_number == 3)
            {
                try {
                    File Lista_camera = new File("D:\\Programare pe obiecte\\Proiect-1\\Proiect-1\\src\\Camera.txt");

                    Scanner sl = new Scanner(Lista_camera);

                    while(sl.hasNextLine())
                    {
                        Apartamente_V.add(sl.nextLine());
                        n++;
                    }
                } catch (IOException e) {
                    System.out.println("A aparut o eroare cu list de oferte. ");
                    e.printStackTrace();
                }

                for (int i = 0; i < Apartamente_V.size(); i++)
                    System.out.println(Apartamente_V.get(i) + " ");
            }    else
            if (Menu_number == 4)
            {
                System.out.println("Ati introdus un numar care  este disponibil in meniu");
            }    else
                System.out.println("Ati introdus un numar care nu este disponibil in meniu");
            System.out.println("Daca doriti sa va intoarceti la meniul prinicpal apasati y daca nu apasati orice altat tasta");
            access_menu = sc.next().charAt(0);
            System.out.println("\n\n");
        }

        /*for (int i = 1; i <= n; i++)
            Apartamente_V.add(apart.toString());

        // Printing elements
        System.out.println(Apartamente_V);

        // Remove element at index 3
        Apartamente_V.remove(3);

        // Displaying the vector
        // after deletion
        System.out.println(Apartamente_V);

        // Printing elements one by one
        for (int i = 0; i < Apartamente_V.size(); i++)
            System.out.print(Apartamente_V.get(i) + " ");*/
    }
}
