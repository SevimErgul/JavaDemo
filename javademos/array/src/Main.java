public class Main {
    public static void main(String[] args) {

        String ogrenci1="Engin";
        String ogrenci2="Eren";
        String ogrenci3="onur";

        String[] ogrenciler=new String[3];
        ogrenciler[0]=ogrenci1;
        ogrenciler[1]=ogrenci2;
        ogrenciler[2]=ogrenci3;
//ogrenciler listesini tek tek gez ogrenci değişken adıyla
        for (String ogrenci:ogrenciler){
            System.out.println(ogrenci);
        }

        double[] mylist={1.0,20.8,4.5,6.3};
        double total=0;
        double max=mylist[0];

        for (double mylistgezici:mylist){
            if (max<mylistgezici){
                max=mylistgezici;
            }
            System.out.println(mylistgezici);
            total=total+mylistgezici;
        }
        System.out.println("toplam:"+total);
        System.out.println("en büyük:" + max);

        String mesaj="hava güzel.";
        System.out.println("5.Eleman:"+mesaj.charAt(3));
        System.out.println(mesaj.concat("Yaşasın"));
        System.out.println(mesaj.replace(' ','-'));
        System.out.println(mesaj.substring(2,5));
        for (String kelime:mesaj.split(" ")){
            System.out.println(kelime);
        }
    }
}