import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList sayilar=new ArrayList();
        sayilar.add(1);
        sayilar.add("antalya");
        sayilar.add("ankara");

        //kaç eleman var
        System.out.println(sayilar.size());
        //verilen idexdeki elemanı getir
        System.out.println(sayilar.get(1));
        //verilen idexdeki elemanı değiştir
        sayilar.set(1,100);
        System.out.println(sayilar.get(1));
        sayilar.remove(1);
        System.out.println(sayilar.get(1));
    }
}