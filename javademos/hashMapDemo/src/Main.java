import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        HashMap<String,String> sozluk=new HashMap<String,String>();
        sozluk.put("book","sözlük");
        sozluk.put("fish","balık");
        System.out.println(sozluk.size());
        for (String item:sozluk.keySet()){
            System.out.println("Eleman-"+item+" değer-"+sozluk.get(item));
        }
        sozluk.remove("fish");
    }
}