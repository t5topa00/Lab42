//Author: Pasi Tolonen MyRepo2
public class main {

   public static void main(String[] args) 
   {
//<<<<<<< HEAD
      double price = 3.3;
      int balance=120;
      Product product = new Product("Edam", price, balance);
      System.out.println("Product value is " + product.countValue());
      product.printProduct();
      price = product.changePrice(price); //Tämä on vähän turha tässä. Halpuutetua yksikköhintaa ei näy missään
      product.printProduct();
      System.out.println("Product 'halpuutettu' value is only " + product.countValue());
      balance = product.changeBalance(5);
      product.printProduct();
      
      }
   /*
=======
      int balance=120;
      Product product = new Product("Edam", 3.3, balance);
      System.out.println("Product value is " + product.countValue());
      product.printProduct();
      
      balance = product.changeBalance(5);
      product.printProduct();
   }
>>>>>>> 89ce3cc457016ae9253bc22d937767b38268260a*/
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
//<<<<<<< HEAD
   public double changePrice (double originalPrice)
   {
      System.out.println();
      double dividedPrice;
      dividedPrice = (originalPrice / 2);
      price = dividedPrice;
      return dividedPrice;
   }
//=======
   public int changeBalance(int newvalue)
   {
      System.out.println();
      amount = amount *newvalue; //viisinkertaistetaan juustojen määrä
      return amount;
//>>>>>>> 89ce3cc457016ae9253bc22d937767b38268260a
   }
}
