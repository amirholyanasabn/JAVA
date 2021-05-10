public class Second {
    public static void main(String[] args) {
        int data2 =15;
//        Integer data = new Integer(5);
//        Integer temp = data;
//        data = new Integer(13);
//        System.out.println(data);
//        System.out.println(temp);
        Integer data = Integer.valueOf(5);
        Integer temp = data;
       // data = Integer.valueOf(13);
        data = data2;

        System.out.println("data "+data);
        System.out.println("temp "+temp);
    }
}
