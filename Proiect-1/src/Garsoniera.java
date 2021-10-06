import java.lang.String;

public class Garsoniera {

    private final String Tip = "Garsoniera";
    private String Put_address;

    private int Put_price;
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
        return Tip + " cu pretul de " + this.Put_price + " euro cu adresa urmatoare: " + this.Put_address + " cu o marime de " + this.Put_meters + " metri patrati " + ". Contact la acest numar de telefon " + this.Put_number + ".";
    }
}
