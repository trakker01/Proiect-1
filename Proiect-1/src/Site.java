import java.io.BufferedWriter;
import java.lang.String;
import java.util.Scanner;
import java.util.Vector;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Site {

    public static void appendStrtoFile(String fileName, String str) {
        try {
            BufferedWriter out = new BufferedWriter(new FileWriter(fileName, true));
            out.write("\n" + str);
            out.close();
        } catch (IOException e) {
            System.out.println("A aparut o eroare" + e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        int price, room, meter, number;
        String address;

        Vector<String> Apartamente_V = new Vector<String>();
        Vector<String> Garsoniera_V = new Vector<String>();
        Vector<String> Camera_V = new Vector<String>();

        Apartament apart = new Apartament();
        Garsoniera gars = new Garsoniera();
        Camera cam = new Camera();

        char access_menu = 'y';
        while (access_menu == 'y' || access_menu == 'Y') {
            System.out.println("Bine ati venit pe site-ul de chirii. Tastati numarul corespunzator cu cel din meniu ");
            System.out.println("1.Apartamente");
            System.out.println("2.Garsoniera");
            System.out.println("3.Camera");
            System.out.println("4.Adauga oferta");

            int Menu_number = sc.nextInt();

            if (Menu_number == 1) {
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
                for (int i = 0; i < Apartamente_V.size(); i++) {
                    System.out.println(i + ". " + Apartamente_V.get(i) + " ");
                }

            } else if (Menu_number == 2) {
                try {
                    File Lista_garsoniera = new File("D:\\Programare pe obiecte\\Proiect-1\\Proiect-1\\src\\Garsoniera.txt");

                    Scanner sl = new Scanner(Lista_garsoniera);

                    while (sl.hasNextLine()) {
                        Garsoniera_V.add(sl.nextLine());
                    }
                } catch (IOException e) {
                    System.out.println("A aparut o eroare cu lista de oferte. ");
                    e.printStackTrace();
                }

                for (int i = 0; i < Garsoniera_V.size(); i++)
                    System.out.println(Garsoniera_V.get(i) + " ");

            } else if (Menu_number == 3) {
                try {
                    File Lista_camera = new File("D:\\Programare pe obiecte\\Proiect-1\\Proiect-1\\src\\Camera.txt");

                    Scanner sl = new Scanner(Lista_camera);

                    while (sl.hasNextLine()) {
                        Camera_V.add(sl.nextLine());
                    }
                } catch (IOException e) {
                    System.out.println("A aparut o eroare cu lista de oferte. ");
                    e.printStackTrace();
                }

                for (int i = 0; i < Camera_V.size(); i++) {
                    System.out.println(i + "." + Camera_V.get(i) + " ");
                }
            } else if (Menu_number == 4) {
                System.out.println("Alegeti tipul de oferta pe care doriti sa adaugati.");
                System.out.println("1.Apartamente");
                System.out.println("2.Garsoniera");
                System.out.println("3.Camera");
                int choose = sc.nextInt();

                if (choose == 1) {
                    System.out.print("\nScrieti addresa pentru apartament ");
                    address = sc.next();
                    apart.setPut_address(address);
                    System.out.print("\nSscrieti pretul in euro ");
                    price = sc.nextInt();
                    apart.setPrice(price);
                    System.out.print("\nScrieti numarul de camere ");
                    room = sc.nextInt();
                    apart.setPut_room(room);
                    System.out.print("\nScrieti numarul de metri patrati ");
                    meter = sc.nextInt();
                    apart.setPut_meters(meter);
                    System.out.print("\nScrieti numarul de telefon \n");
                    number = sc.nextInt();
                    apart.setPut_number(number);
                    System.out.print("Se adauga oferta de chirie apartament in site la sectiunea de apartamente: ");
                    System.out.println(apart.toString());

                    appendStrtoFile("D:\\Programare pe obiecte\\Proiect-1\\Proiect-1\\src\\Apartamente.txt", apart.toString());
                } else if (choose == 2) {
                    System.out.print("\nScrieti addresa pentru apartament ");
                    address = sc.next();
                    apart.setPut_address(address);
                    System.out.print("\nSscrieti pretul in euro ");
                    price = sc.nextInt();
                    apart.setPrice(price);
                    System.out.print("\nScrieti numarul de metri patrati ");
                    meter = sc.nextInt();
                    apart.setPut_meters(meter);
                    System.out.print("\nScrieti numarul de telefon ");
                    number = sc.nextInt();
                    apart.setPut_number(number);
                    System.out.println(apart.toString());
                } else if (choose == 3) {
                    System.out.println("Ati introdus un numar care nu este disponibil in meniu");
                } else
                    System.out.println("Ati introdus un numar care nu este disponibil in meniu");
            } else
                System.out.println("Ati introdus un numar care nu este disponibil in meniu");
            System.out.println("Daca doriti sa va intoarceti la meniul prinicpal apasati y daca nu apasati orice altat tasta");
            access_menu = sc.next().charAt(0);
            System.out.println("\n\n");
        }
    }
}
