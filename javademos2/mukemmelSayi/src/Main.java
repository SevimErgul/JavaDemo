public class Main {
    public static void main(String[] args) {

        int number=27;
        int total=0;
        for (int i=1;i<number;i++){
            if (number%i==0){
                total=total+i;
            }
        }
        if (total==number){
            mesajVer("Sayı mükemmeldir");
        }else {
            mesajVer("Sayı mükemmel değil");
        }
    }
    public static void mesajVer(String mesaj){
        System.out.println("Sayı mükemmeldir");
    }
}