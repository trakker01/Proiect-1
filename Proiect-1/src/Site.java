import java.lang.String;
import java.util.Scanner;

public class Site {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char access_menu = 'y';
        while (access_menu == 'y' || access_menu == 'Y')
        {   System.out.println("Bine ati venit pe site-ul de chirii. Tastati numarul respctiv pentru meniu-ul care doriti sa accesati ");
            System.out.println("1.Apartamente");
            System.out.println("2.Garsoniera");
            System.out.println("3.Casa/camera");
            System.out.println("4.Adauga oferta");

            int Menu_number = sc.nextInt();

            if (Menu_number == 1)
            {
                System.out.println("Ati introdus un numar care  este disponibil in meniu");
            }    else
            if (Menu_number == 2)
            {
                System.out.println("Ati introdus un numar care  este disponibil in meniu");
            }    else
            if (Menu_number == 3)
            {
                System.out.println("Ati introdus un numar care  este disponibil in meniu");
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
    }
}
