import java.util.*;
import java.lang.String;
import java.util.Scanner;

public class Apartament {

    Scanner sc = new Scanner(System.in);

    private double Put_price;
    private String Put_address = "";
    private String Tip = "Apartament";
    private double Put_room;
    private double Put_meters;
    private double Put_number;

    public double setPrice(double price)
    {
        this.Put_price = sc.nextDouble();
        return this.Put_price;
    }

    public double getPut_price() {
        return this.Put_price;
    }

    public String setPut_address(String address){
        this.Put_address = address;
        return this.Put_address;
    }
    public String getPut_address(){
        return this.Put_address;
    }

    public double setPut_room(double room)
    {
        this.Put_room = sc.nextDouble();
        return this.Put_room;
    }
    public double getPut_room() {
        return this.Put_room;
    }

    public double setPut_meters(double meters)
    {
        this.Put_meters = sc.nextDouble();
        return this.Put_meters;
    }
    public double getPut_meters() {
        return this.Put_meters;
    }

    public double setPut_number(double number)
    {
        this.Put_number = sc.nextDouble();
        return this.Put_number;
    }
    public double getPut_number() {
        return this.Put_number;
    }

    public String toString(){
        return Tip + " " + this.Put_price + " euro " + this. Put_address + " " + this.Put_meters + " metri patrati " + this.Put_room + " camere " + this.Put_number + " numar de telefon";
    }
}
