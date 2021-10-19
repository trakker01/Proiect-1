package Site.oferte;

import java.io.*;
import java.lang.String;
import java.util.Scanner;
import java.util.Vector;

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

   public void delete(String filename, int startline, int numlines, int notneeded)
    {
        try
        {
            BufferedReader br = new BufferedReader(new FileReader(filename));

            //String buffer to store contents of the file
            StringBuffer sb=new StringBuffer("");

            //Keep track of the line number
            int linenumber=1;
            String line;

            while((line=br.readLine())!=null)
            {
                //Store each valid line in the string buffer
                if(linenumber!=notneeded)
                    sb.append(line+"\n");
                linenumber++;
            }
            if(startline+numlines>linenumber)
                System.out.println("End of file reached.");
            br.close();

            FileWriter fw = new FileWriter(new File(filename));
            //Write entire string buffer into the file
            fw.write(sb.toString());
            fw.close();
        }
        catch (Exception e)
        {
            System.out.println("Something went horribly wrong: "+e.getMessage());
        }
    }

    public static void main(String[] args) {


        int a = 0, g = 0, c = 0;
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        int price, room, meter, number;
        String address;

        Vector<String> Apartamente_V = new Vector<>();
        Vector<String> Garsoniera_V = new Vector<>();
        Vector<String> Camera_V = new Vector<>();

        Apartament apart = new Apartament();
        Garsoniera gars = new Garsoniera();
        Camera cam = new Camera();

        char access_menu = 'y';
        while (access_menu == 'y' || access_menu == 'Y') {
            System.out.println("Bine ati venit pe site-ul de chirii. Tastati numarul corespunzator cu cel din meniu: ");
            System.out.println("1.Apartamente");
            System.out.println("2.Garsoniera");
            System.out.println("3.Camera");
            System.out.println("4.Adauga oferta");

            int Menu_number = sc.nextInt();

            if (Menu_number == 1) {
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



            } else if (Menu_number == 2) {
                try {
                    File Lista_garsoniera = new File("D:\\Programare pe obiecte\\Proiect-1\\Proiect-1\\src\\chirias\\oferte\\Garsoniera.txt");

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

            } else if (Menu_number == 3) {
                try {
                    File Lista_camera = new File("D:\\Programare pe obiecte\\Proiect-1\\Proiect-1\\src\\chirias\\oferte\\Camera.txt");

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
                    System.out.print("\nScrieti numarul de telefon");
                    number = sc.nextInt();
                    apart.setPut_number(number);
                    System.out.print("Se adauga oferta de chirie apartament in site la sectiunea de apartamente: ");
                    System.out.println(apart.toString());

                    appendStrtoFile("D:\\Programare pe obiecte\\Proiect-1\\Proiect-1\\src\\chirias\\oferte\\Apartamente.txt", apart.toString());
                } else if (choose == 2) {
                    System.out.print("\nScrieti addresa pentru garosniera ");
                    address = sc.next();
                    gars.setPut_address(address);
                    System.out.print("\nSscrieti pretul in euro ");
                    price = sc.nextInt();
                    gars.setPrice(price);
                    System.out.print("\nScrieti numarul de metri patrati ");
                    meter = sc.nextInt();
                    gars.setPut_meters(meter);
                    System.out.print("\nScrieti numarul de telefon ");
                    number = sc.nextInt();
                    gars.setPut_number(number);
                    System.out.println(apart.toString());

                    appendStrtoFile("D:\\Programare pe obiecte\\Proiect-1\\Proiect-1\\src\\chirias\\oferte\\Garsoniera.txt", gars.toString());
                } else if (choose == 3) {
                    String la;
                    System.out.print("Scrieti daca camera se afla la apartament/bloc sau casa ");
                    la = sc.next();
                    cam.setPut_Locatie(la);
                    System.out.print("\nScrieti addresa pentru unde se afla chiria ");
                    address = sc.next();
                    cam.setPut_address(address);
                    System.out.print("\nSscrieti pretul in euro ");
                    price = sc.nextInt();
                    cam.setPrice(price);
                    System.out.print("\nScrieti numarul de metri patrati ");
                    meter = sc.nextInt();
                    cam.setPut_meters(meter);
                    System.out.print("\nScrieti numarul de telefon ");
                    number = sc.nextInt();
                    cam.setPut_number(number);
                    System.out.println(apart.toString());

                    appendStrtoFile("D:\\Programare pe obiecte\\Proiect-1\\Proiect-1\\src\\chirias\\oferte\\Camera.txt", cam.toString());
                } else
                    System.out.println("Ati introdus un numar care nu este disponibil in meniu");
            } else
                System.out.println("Ati introdus un numar care nu este disponibil in meniu");
            System.out.println("Daca doriti sa va intoarceti la meniul prinicpal apasati y daca nu apasati orice altat tasta");

            access_menu = sc.next().charAt(0);
            System.out.println(" ");
        }
    }
}
