import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList(new String[]{"ali", "neda", "amir65", "1124", "neda65"}));
        Stream<String> stream = list.stream();
//        Predicate<String> nothing = (s) -> {
//            if (s.matches("[a-z]+"))
//                return false;
//            else
//                return true;
//        };

        Predicate<String> allTheAlphabetIsNumeric = (s) -> {
            if (s.matches("[1-9]+"))
                return true;
            else
                return false;
        };

//        boolean res = nothing.test("neda");
//        boolean res1 = nothing.test("1124");
//        boolean res2 = nothing.test("neda65");
//        System.out.println(res);
//        System.out.println(res1);
//        System.out.println(res2);

        boolean resIsNum = allTheAlphabetIsNumeric.test("1124");
        boolean resIsNum1 = allTheAlphabetIsNumeric.test("amir1124");
        System.out.println(resIsNum + " " + resIsNum1);


//
        stream
                .filter(s->s.matches("[a-z]+"))
                .forEach(s-> System.out.println(s));
    }
}
