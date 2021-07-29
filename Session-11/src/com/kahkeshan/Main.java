package com.kahkeshan;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            String str = "";
            File file = new File("E:\\text.txt");
            FileReader fr = new FileReader(file);
            BufferedReader bf = new BufferedReader(fr);
            while (true){
                str += bf.readLine();

                if (str == null)
                    break;
                System.out.println(str);
            }
            System.out.println(str);
//            FileReader fr = new FileReader("E:\\text.txt");
//            FileReader fr = new FileReader("E:\\text.txt");
//            BufferedReader bf = new BufferedReader(fr);
//            FileInputStream fs = new FileInputStream("E:\\text.txt");
//            BufferedInputStream bf = new BufferedInputStream(fs);
//            while (fs.read() != -1 ){
//                str +=  (char)fs.read();
//            }
//            System.out.println(str);
        } catch (FileNotFoundException e) {
            System.out.println("File not valid");
        } catch (IOException e) {
            System.out.println("Not Stream file");
        }
    }
}
