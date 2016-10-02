//Author: Pasi Tolonen MyRepo2
public class main {

   public static void main(String[] args) 
   {
      double price = 3.3;
      Product product = new Product("Edam", price, 120);
      System.out.println("Product value is " + product.countValue());
      product.printProduct();
      price = product.changePrice(price); //Tämä on vähän turha tässä. Halpuutetua yksikköhintaa ei näy missään
      product.printProduct();
      System.out.println("Product 'halpuutettu' value is only " + product.countValue());
      
      }
}

class Product {

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

   public void printProduct() {
      System.out.printf("Product %s, price %4.1f and balance %d pcs", name, price, amount);
   }
   public double changePrice (double originalPrice)
   {
      System.out.println();
      double dividedPrice;
      dividedPrice = (originalPrice / 2);
      price = dividedPrice;
      return dividedPrice;
   }
}
