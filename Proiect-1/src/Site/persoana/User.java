package Site.persoana;

import Site.interfaces.IContSite;

import java.util.Scanner;

public class User implements IContSite {

    public User() {

    }

    Scanner sc = new Scanner(System.in);

    private String name;
    private int age;
    private String mail;
    private String phone;

    @Override
    public String FullName(String name) {
        this.name = name;
        return this.name;
    }

    @Override
    public boolean isMajor(int Age) {
        this.age = Age;
        if (age >= 18)
            return true;
        else
            return false;
    }

    @Override
    public String AccountMail(String mail) {
        this.mail = mail;
        return this.mail;
    }

    @Override
    public String PhoneNumber(String phone) {
        this.phone = phone;
        return this.phone;
    }
}
