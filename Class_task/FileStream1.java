package Class_task;

import java.io.FileInputStream;

public class FileStream1 {
    public static void main(String[] args) {
        try{    
            FileInputStream fileInputStream = new FileInputStream("/Users/javidalasgarli/Desktop/ABB/Class_task/a.txt");
            int a;
            while ((a = fileInputStream.read()) != -1) {
                System.out.print((char)a);   
            }
            fileInputStream.close();
          }catch(Exception e){
            System.out.println(e);
        }    
    }  
}

