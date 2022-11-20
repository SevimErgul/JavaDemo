import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Customer> customers=new ArrayList<Customer>();

        Customer engin=new Customer(1,"Engin","Demiroğ");
        customers.add(engin);
        customers.add(new Customer(2,"Enes","Demiroğ"));
        //new diyip ynei kayot ekledin silmez listeden bunu
        customers.remove(new Customer(2,"Enes","Demiroğ"));

        customers.remove(engin);
        for (Customer customer:customers){
            System.out.println(customer.firstName);
        }
    }
}