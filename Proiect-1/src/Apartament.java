import java.lang.String;
import java.util.Scanner;
import java.util.Vector;
import java.io.File;
import java.io.IOException;

public class Apartament {

    Scanner sc = new Scanner(System.in);

    private int Put_price;
    private String Put_address;
    private String Tip = "Apartament";
    private int Put_room;
    private int Put_meters;
    private int Put_number;

    public int setPrice(int price)
    {
        this.Put_price = price;
        return this.Put_price;
    }

    public int getPut_price() {
        return this.Put_price;
    }

    public String setPut_address(String address){
        this.Put_address = address;
        return this.Put_address;
    }
    public String getPut_address(){
        return this.Put_address;
    }

    public int setPut_room(int room)
    {
        this.Put_room = room;
        return this.Put_room;
    }
    public int getPut_room() {
        return this.Put_room;
    }

    public int setPut_meters(int meters)
    {
        this.Put_meters = meters;
        return this.Put_meters;
    }
    public int getPut_meters() {
        return this.Put_meters;
    }

    public int setPut_number(int number)
    {
        this.Put_number = number;
        return this.Put_number;
    }
    public int getPut_number() {
        return this.Put_number;
    }

    public String toString(){
        return Tip + " " + this.Put_price + " euro " + this. Put_address + " " + this.Put_meters + " metri patrati " + this.Put_room + " camere " + this.Put_number + " numar de telefon";
    }
}
