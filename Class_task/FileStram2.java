package Class_task;


import java.io.FileOutputStream;

public class FileStram2 {
    public static void main(String[] args) {
        try{    
            FileOutputStream fileOutputStream = new FileOutputStream("/Users/javidalasgarli/Desktop/ABB/Class_task/a.txt");
            String word = "Hello World";
            for(int i=0; i<word.length(); i++) {
                fileOutputStream.write((byte)word.charAt(i));
            }
            System.out.println("Done!");
            fileOutputStream.close();
          }catch(Exception e){
            System.out.println(e);
        } 
    }
}
