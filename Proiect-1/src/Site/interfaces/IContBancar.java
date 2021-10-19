package Site.interfaces;

public interface IContBancar {

    public abstract String FullName(String nume);

    public abstract String NumberCard(String number);

    public abstract String CVC(String cvc);

    public abstract int Month(int month);

    public abstract int Year(int year);

    public abstract int Sold(int sold);
}
