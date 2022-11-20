import matematik.*;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Adiniz:");
        String isim=scanner.nextLine();
        System.out.println("hoşgeldiniz:"+isim);
        DortIslem dortIslem=new DortIslem();
        dortIslem.topla(3,6);
        Logartima logartima=new Logartima();

    }
}