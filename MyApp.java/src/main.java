//Author: Pasi Tolonen MyRepo2
public class main {

   public static void main(String[] args) 
   {
      int balance=120;
      Product product = new Product("Edam", 3.3, balance);
      System.out.println("Product value is " + product.countValue());
      product.printProduct();
      
      balance = product.changeBalance(5);
      product.printProduct();
   }
}

class Product 
{

   private String name;
   private double price;
   private int amount; //Amount in storage

   public Product(String name, double price, int amount) 
   {
      this.name = name;
      this.price = price;
      this.amount = amount;
      
   }

   public double countValue() 
   {
      return (amount * price);
   }

   public void printProduct() 
   {
      System.out.printf("Product %s, price %4.1f and balance %d pcs", name, price, amount);
   }
   public int changeBalance(int newvalue)
   {
      System.out.println();
      amount = amount *newvalue; //viisinkertaistetaan juustojen määrä
      return amount;
   }
}
