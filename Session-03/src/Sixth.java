public class Sixth {
    public static void main(String[] args) {
        String data = "Sepration of Nader and Simin";

        System.out.println(data.length());

        boolean flag =data.startsWith("sep");
        System.out.println(flag);
        boolean lastFlag=data.endsWith("in");
        System.out.println(lastFlag);
        int indexOfData=data.indexOf("too");
        System.out.println(indexOfData);
       int f2= data.lastIndexOf("imin");
        System.out.println(f2);
    }
}
