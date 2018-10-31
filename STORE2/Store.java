import java.util.*;

public class Store {
								// Creates the Store and its contents.
	String name;
	ArrayList<Product> catalogList = new ArrayList<Product>();
	
	public Store(String name) {
		this.name = name;
	}
	
	public void addProduct(Product p) {
		catalogList.add(p);
	}
	
	public void increaseQuantity(String productCode, int n) {
		boolean found = false;
		for(int i = 0; i < catalogList.size() && !found; i++){
			if(((catalogList.get(i)).getProdID()).equals(productCode)) {
				(catalogList.get(i)).increaseQuantity(n);
				found = true;
			}
		}
		if(!found)
			System.out.println("Product code doesn't exist");
	}
	
	public String getName() {
		return name;
	}
	
	public ArrayList<Product> getCatalog() {
		return catalogList;
	}
}