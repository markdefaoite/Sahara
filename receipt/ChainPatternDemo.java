package receipt;


public class ChainPatternDemo {
	
   private static Reciept getReciept(){

      Reciept bankReciept = new BankReciept(Reciept.BANK);
      Reciept storeReciept = new StoreReciept(Reciept.STORE);
      Reciept userReciept = new UserReciept(Reciept.USER);

      bankReciept.setNextReciept(storeReciept);
      storeReciept.setNextReciept(userReciept);

      return bankReciept;	
   }

   public static void main(String[] args) {
      Reciept rec = getReciept();

      rec.logReciept(Reciept.USER, 
         "\n Username: Mike123.s \n Order #:1134 \n Product :0008 - Red Dead Redemption 2 - Quantity :1 - Price:$69.99 - Discount:NO DISCOUNT \n Total:$69.99 \n Transaction Date:01/11/2018");

      rec.logReciept(Reciept.STORE, 
         "\n Username: Mike123.s \n Order #:1134 \n Product :0008 - Red Dead Redemption 2 - Quantity :1 - Price:$69.99 - Discount:NO DISCOUNT \n Total:$69.99 \n Transaction Date:01/11/2018");

      rec.logReciept(Reciept.BANK, 
		 "\n Username: Mike123.s \n Order #:1134 \n Product :0008 - Red Dead Redemption 2 - Quantity :1 - Price:$69.99 - Discount:NO DISCOUNT \n Total:$69.99 \n Transaction Date:01/11/2018");
   }
}