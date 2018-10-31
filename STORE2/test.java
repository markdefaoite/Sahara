import java.util.*;
public class test {
	public static void main(String[] args){
		Store sahara = new Store("SAHARA"); 														 // Create Store
		
		Product p1 = new Product.ProductBuilder("1234", "Stick").price(6.99).quantity(20).build(); 	 // Create product
		sahara.addProduct(p1);																		 // add product to store
		Product p2 = new Product.ProductBuilder("1423", "Water Bottle (750ml)").price(1.99).build(); // Create product
		sahara.addProduct(p2);																		 // add product to store
		
		ArrayList<Product> catalog = sahara.getCatalog(); 											 // load in the catalog
		System.out.println( sahara.getName() + " CATALOG");
		for(int i = 0 ; i < catalog.size() ; i++){													 // print catalog
			Product product = catalog.get(i);
			System.out.printf("%-25s", (i+1) + ": " + product.getProdName());
			System.out.println(" $" + product.getProdPrice());
		}
	}
}