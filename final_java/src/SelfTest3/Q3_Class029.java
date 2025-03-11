package SelfTest3;

class Sawon005{  
	   int pay      =10000;      
	   static int su=10;   
	   static int basicpay=pay;  
	    
	   static int basicpay2;
	   static {  basicpay2=20000; }
	 
	   public static void showSu() {   System.out.println(su);  }         

	   public  void  showAll001() {   
	       System.out.println(su);
	       System.out.println(this.pay);
	   }

	   public static  void  showAll002() {
	       showAll001();     
	       System.out.println(this.pay); 
	   } 
	} 
	public class Q3_Class029 {
	  public static void main(String[] args) {
	   Sawon005  sola = new Sawon005();  
	   sola.showAll001();
	  }
	}
