package chirias.persoana;

import chirias.interfaces.IContSite;
import java.util.Scanner;

public class User implements IContSite {

    public User(){

    }

    Scanner sc = new Scanner(System.in);

    private String name;
    private int age;
    private String mail;
    private String phone;

    @Override
    public String FullName(){
        name = sc.next();
        return name;
    }

    @Override
    public boolean isMajor(){
        age = sc.nextInt();
        if(age >= 18)
            return true;
        else
        return false;
    }

    @Override
    public String AccountMail(){
        mail = sc.next();
        return mail;
    }

    @Override
    public String PhoneNumber(){
        phone = sc.next();
        return phone;
    }
}
