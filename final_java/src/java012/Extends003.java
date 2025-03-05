package java012;

class MobileNote7 {
	private String Iris;
	public String getIris() {return Iris;}
	public void setIris(String iris) {Iris = iris;	}

	void newshow() {
	 System.out.println("NOTE7 새로운 기능\n"+getIris());
	};
	
}


class MobileNote8 extends MobileNote7  {
	private String face;
		
	public String getFace() {return face;}
	public void setFace(String face) {this.face = face;}

	@Override void newshow() {super.newshow();
		System.out.println("NOTE8 새로운 기능\n"+getFace());
	};
}

class MobileNote9 extends MobileNote8 {
	private int battery;

	public int getBattery() {return battery;}
	public void setBattery(int battery) {this.battery = battery;}
	
	@Override void newshow() {super.newshow();
		System.out.println("NOTE9 새로운 기능\n"+getBattery());
}
}

public class Extends003 {
	public static void main(String[] args) {
		MobileNote9 my9 = new MobileNote9();
		my9.setIris("brown");
		my9.setFace("Handsoem");
		my9.setBattery(24);
		my9.newshow();
		
	}
		

}
