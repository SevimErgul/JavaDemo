public class Main {
    public static void main(String[] args) {
        int sayi = topla(6, 85);
        System.out.println(sayi);
        int toplam = topla2(2, 3, 5, 8, 9);
        System.out.println(toplam);
        int number=carp(2,3,5);
        System.out.println(number);
    }

    public static int topla(int sayi1, int sayi2) {
        return sayi1 + sayi2;
    }

    public static int topla2(int... sayilar) {
        int toplam = 0;
        for (int sayi : sayilar) {
            toplam += sayi;
        }
        return toplam;
    }

    public static int carp(int...numbers){
        int carpma=1;
        for (int number:numbers){
            carpma*=number;
        }
        return carpma;
    }
}