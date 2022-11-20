public abstract class GameCalculator {
    //hesaplayı kim kullanırsa kendi hesapla metodunu yazmak zorunda
    public abstract void hesapla();
    //gamecalculatoru kim kullanırsa bu kuralı değiştirmeden kullanmak zorundadır
    public final void gameOver(){
        System.out.println("Oyun bitti");
    }
}
