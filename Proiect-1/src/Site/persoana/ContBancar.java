package Site.persoana;


import Site.interfaces.IContBancar;

import java.util.Scanner;
import java.util.Random;

public class ContBancar implements IContBancar {

    public ContBancar() {

    }

    Scanner sc = new Scanner(System.in);
    Random rnd = new Random();

    private String name;
    private String card_whole;
    private String CVC;
    private int year;
    private int month;
    private int sold;


    @Override
    public String FullName(String nume) {
        this.name = nume;
        return this.name;
    }

    @Override
    public String CVC(String cvc) {
        this.CVC = cvc;
        return this.CVC;
    }

    @Override
    public String NumberCard(String Number) {
        this.card_whole = Number;
        return this.card_whole;
    }

    @Override
    public int Month(int Month) {
        this.month = Month;
        return this.month;
    }

    @Override
    public int Year(int Year) {
        this.year = Year;
        return this.year;
    }

    @Override
    public int Sold(int sold) {
        System.out.print("Sold-ul in lei: ");
        this.sold = sold;
        return this.sold;
    }
}
