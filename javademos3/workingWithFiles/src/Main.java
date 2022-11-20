import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    //createFile();
        getFileInfo();
        readFile();
        writeFile();
        readFile();
    }
    public static void createFile(){
        File file=new File("D:\\javademos\\files\\students.txt");
        try {
            if (file.createNewFile()){
                System.out.println("dosya oluştu");
            }else {
                System.out.println("dosya zaten var");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void getFileInfo(){
        File file=new File("D:\\javademos\\files\\students.txt");
        if (file.exists()){
            System.out.println("dosya adı:" + file.getName());
            System.out.println("dosya yolu:" + file.getAbsolutePath());
            System.out.println("dosya yazılabilir mi:" + file.canWrite());
            System.out.println("dosya okunabilir mi:" + file.canRead());
            System.out.println("dosya boyutu (byte):" + file.length());
        }
    }

    public static void readFile(){
        File file=new File("D:\\javademos\\files\\students.txt");
        try {
            Scanner reader=new Scanner(file);
            while (reader.hasNextLine()){
                String line=reader.nextLine();
                System.out.println(line);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    public static void writeFile(){
        try {
            BufferedWriter writer=new BufferedWriter(new FileWriter("D:\\javademos\\files\\students.txt",true)) ;
            writer.newLine();
            writer.write("ahmed");
            System.out.println("yazıldı");
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}