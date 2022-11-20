public class Main {
    public static void main(String[] args) {

        Product product=new Product();
        product.name="laptop";
        product.price=100;
        product.id=1;
        ProductManager productManager=new ProductManager();
        productManager.add(product);
    }
}