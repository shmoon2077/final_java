package java016_ex;

import java.util.HashMap;
import java.util.Map;

class Fruit{
	   private int no;
	   private String name;
	public Fruit() {
		super();
	}
	public Fruit(int no, String name) {
		super();
		this.no = no;
		this.name = name;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Fruit [no=" + no + ", name=" + name + "]";
	}    
	   
	   
	}

public class MapEx004 {
	   public static void main(String[] args) {
		      Map< Fruit, Integer > map = new HashMap<>();
		      
		      map.put( new Fruit(1, "Apple")  , 1);
		      map.put( new Fruit(1, "Apple")  , 1);
		      map.put( new Fruit(2, "Banana") , 2);
		                           
              System.out.println("Total : " + map.size());

              
              
              
	   }
	}
