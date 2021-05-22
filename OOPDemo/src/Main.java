public class Main {
    public static void main(String[] args) {
        Person p =new Person();
        p.name = "Ali";
        p.age = 20;
        p.book = new Book();
        p.book.title = "History of Iran";

        p.age++; //20+1 => age : 21
        System.out.println(p.age); // print age - age is 21

        Person p1 = new Person();
        p1.name = "Kia";
        p1.age = 29;

        p = p1;
        System.out.println(p.age);
        System.out.println(p.name);

        System.out.println(p.book.getTitle());
    }
}
