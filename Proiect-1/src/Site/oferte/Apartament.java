package Site.oferte;

import java.lang.String;

public class Apartament {

    private String Put_address;
    private final String Tip = "Apartament";

    private int Put_price;
    private int Put_room;
    private int Put_meters;
    private int Put_number;

    public int setPrice(int price) {
        this.Put_price = price;
        return this.Put_price;
    }

    public int getPut_price() {
        return this.Put_price;
    }

    public String setPut_address(String address) {
        this.Put_address = address;
        return this.Put_address;
    }

    public String getPut_address() {
        return this.Put_address;
    }

    public int setPut_room(int room) {
        this.Put_room = room;
        return this.Put_room;
    }

    public int getPut_room() {
        return this.Put_room;
    }

    public int setPut_meters(int meters) {
        this.Put_meters = meters;
        return this.Put_meters;
    }

    public int getPut_meters() {
        return this.Put_meters;
    }

    public int setPut_number(int number) {
        this.Put_number = number;
        return this.Put_number;
    }

    public int getPut_number() {
        return this.Put_number;
    }

    public String toString() {
        return Tip + " cu pretul de " + this.Put_price + " euro cu adresa urmatoare: " + this.Put_address + " cu o marime de " + this.Put_meters + " metri patrati cu " + this.Put_room + " camere. Contact la acest numar de telefon " + this.Put_number + ".";
    }

    public String toString1(int t) {
        if (t == 1) {
            return "Apartament la pretul de " + this.Put_price + " cu adresa urmatoare: " + this.Put_address + " cu marimea de " + this.Put_meters + " metri patrati cu " + this.Put_room + " camere. Contact la numarul de telefon urmator: " + this.Put_number + ".";
        } else if (t == 2) {
            return "Garsoniera la pretul de " + this.Put_price + " cu adresa urmatoare: " + this.Put_address + " cu marimea de " + this.Put_meters + " metri patrati. Contact la numarul de telefon urmator: " + this.Put_number + ".";
        } else return null;
    }
}
