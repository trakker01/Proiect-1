package chirias.persoana;


import chirias.interfaces.IContBancar;
import java.util.Scanner;
import java.util.Random;

public class ContBancar implements IContBancar {

    public ContBancar(){

    }

    Scanner sc = new Scanner(System.in);
    Random rnd = new Random();

    private String name;
    private String card_whole;
    private String phone;
    private int year;
    private int month;
    private String cnp;
    private int sold;

    @Override
    public String CNP(){
        cnp = sc.next();
        return cnp;
    }

    @Override
    public String FullName(){
        name = sc.next();
        return name;
    }

    @Override
    public String PhoneNumber(){
        phone = sc.next();
        return phone;
    }

    @Override
    public String NumberCard(){
        card_whole = sc.next();
        return card_whole;
    }

    @Override
    public int Month(){
        month = sc.nextInt();
        return month;
    }

    @Override
    public int Year(){
        month = sc.nextInt();
        return year;
    }

    @Override
    public int Sold(){
        System.out.print("Sold-ul in lei: ");
        sold = sc.nextInt();
        return sold;
    }
}
