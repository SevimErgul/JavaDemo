import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> sehirler=new ArrayList<String>();
        sehirler.add("izmir");
        sehirler.add("van");
        sehirler.add("muş");
        sehirler.add("manisa");
        sehirler.remove("van");
        Collections.sort(sehirler);
        for (String sehir:sehirler){
            System.out.println(sehir);
        }
    }
}