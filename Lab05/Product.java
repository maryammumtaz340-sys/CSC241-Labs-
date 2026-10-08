public class Product{
        private String id;
        private double price;
        private int quantity;
        private String name;
        private Date md;
      
        private static double maxprice= 0.0;
        private static double minprice=0.0;
        private static int counter = 0;
   
     Product(String name, double price, int quantity){
        this(name, price, quantity, new Date(1,1,2027));
    }
   Product(String name, double price, int quantity,Date md){
        this.md = md;
         this.name = name;
        this.price = price;
        this.quantity = quantity;
        
      id= String.format("p%03d", counter++);
     
      if (counter==1){
      maxprice= price;
      minprice=price;
    }
     if(counter>1 && minprice>price){
      minprice =price;
    }
     if(counter>1 && maxprice<price){
      maxprice =price;
    }
   }
   void display(){
    System.out.printf("ID: %s \n" , id);
    System.out.printf("Name: %s \n" , name);
    System.out.printf("Price: %.2f \n" , price);
    System.out.printf("Quantity: %d \n" ,quantity);
    System.out.println("Maxprice:" + maxprice);
    System.out.println("Minprice:" + minprice);
    
    System.out.println("Manufacturing Date:" + md.tostring());
  }
}
  
   