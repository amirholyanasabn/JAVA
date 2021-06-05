public class Main {

    public int a = 1;
    public static  int b = 2;

    public void aa(){
        System.out.println("AA");
    }
    public static void bb(){
        System.out.println("BB");
    }
    public static void main(String[] args) {
        Main.bb();
        System.out.println(Main.b);
        Main main = new Main();
        System.out.println(main.a);
        main.aa();
    }
}
