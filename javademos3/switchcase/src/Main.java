public class Main {
    public static void main(String[] args) {

        char grade='D';
        switch (grade){
            case 'A':
                System.out.println("mükemmel:Geçtiniz");
                break;
            case 'B':
                System.out.println("çok iyi:Geçtiniz");
                break;
            case 'C':
                System.out.println("iyi:Geçtiniz");
                break;
            case 'D':
                System.out.println("kötü:Kaldınız");
                break;
            default:
                System.out.println("Geçersiz not girdin");
        }
    }
}