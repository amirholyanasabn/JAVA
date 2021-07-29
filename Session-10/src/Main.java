import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Person p1 = new Person("Amirhossein",35);
        ArrayList<Person> list = new ArrayList<>();
        list.add(p1);

       Person p2 = new Person("Neda",35);
        list.add(p2);

        if(list.contains(new Person("Neda",35)))
            System.out.println("OK");


        Set<String> set = new HashSet<>();
        set.add("Amir");
        set.add("Ali");
        set.add("Amir");

        for(String item : set )
            System.out.println(item);
    }
}
