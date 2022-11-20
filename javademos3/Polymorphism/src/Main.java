public class Main {
    public static void main(String[] args) {

//        BaseLogger[] loggers=new BaseLogger[]{new FileLogger(),new EmailLogger(),new DatabaseLogger()};
//        for (BaseLogger logger:loggers){
//            logger.Log(":mesaj");
//        }
        CustomerMnager customerMnager=new CustomerMnager(new FileLogger());
        customerMnager.Add();
    }
}