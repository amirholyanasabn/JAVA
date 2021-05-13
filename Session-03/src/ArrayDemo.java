public class ArrayDemo {
    public static void main(String[] args) {
        int[] numbers ={12,22,44,90}; //int[] numbers = new int[4];
        String[] names = new String[4];
        names[0]="Amirhossein";
        names[1]="Ali";
        names[2]="Sepideh";
        names[3]="Gucci";
        String[] families={"Olyanasab","Khoshkhabari","Olyanasab","Olyanasab"};
        for(int i =0;i<names.length;i++){
            System.out.println(names[i]);
        }
        String data ="sepration nader of simin";
        char[] chars = data.toCharArray();
        for (int i =0 ;i<chars.length;i++)
            System.out.println(chars[i]);

    }
}
