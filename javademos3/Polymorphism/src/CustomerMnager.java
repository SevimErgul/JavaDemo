public class CustomerMnager {

    private BaseLogger logger;
    public CustomerMnager(BaseLogger logger){
        this.logger=logger;
    }

    public void Add(){
        System.out.println("müşteri eklendi");
        this.logger.Log("Log mesajı");
    }
}
