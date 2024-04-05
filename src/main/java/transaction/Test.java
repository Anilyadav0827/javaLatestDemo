package transaction;

public class Test {
    public static void main(String[] args) {
        Transaction transaction= new Transaction();
        int t=transaction.getTransaction("4444 4444 6666","345",1000);
        System.out.println(t);

        Transaction transaction1= new Transaction();
        int t1=transaction.getTransaction("4444 4444 6666","345",1000);
        System.out.println(t1);
        Transaction transaction2= new Transaction();
        int t2=transaction.getTransaction("4444 4444 6666","345",1000);
        System.out.println(t2);

        Transaction transaction3= new Transaction();
        int t3=transaction.getTransaction("4444 4444 6666","345",1000);
        System.out.println(t3);
        Transaction transaction4= new Transaction();
        int t4=transaction.getTransaction("4444 4444 6666","345",1000);
        System.out.println(t4);
        int repaying=transaction.rePayCardAmount("4444 4444 6666",5000);
        System.out.println(repaying);
//        Product product= new Product();
////        product.color="balck";
////        //product.price=800;
////        product.size="xl";
//        product.type="shirt";
//        ShoppingService service= new ShoppingService();
//       Product shopping= service.selectProduct(product);
//        System.out.println(shopping);
    }
}
