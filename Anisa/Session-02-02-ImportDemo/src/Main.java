import fars.Shiraz;
import fars.Weather;
import tehran.Karaj;
import tehran.Tehran;

public class Main {
    public static void main(String[] args) {
        Shiraz shiraz = new Shiraz();
        Weather weatherShiraz = new Weather();
        Tehran tehran = new Tehran();
        tehran.Weather weatherTehran = new tehran.Weather();
        Karaj karaj = new Karaj();
        System.out.println(karaj.capital);
        karaj.karajUni();
    }
}
