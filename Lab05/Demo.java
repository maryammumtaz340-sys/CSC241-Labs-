public class Demo{
   public static void main(String args[]){
         Date d1 = new Date(1,1,2027);
        Product p1 = new Product("Keybaord",
                                  200.00,
                                  1, 
                                   d1);
        Product p2 = new Product("Mouse",
                                  150.00,
                                  2, 
                                   d1);
        Product p3 = new Product("Pen",
                                  300.00,
                                   5,
                                   d1);
       
        p1.display();
        p2.display();
        p3.display();
       
 }
}