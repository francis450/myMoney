public class MoneyTest{
	public static void main(String [] args){
		Money user1 = new Money();

		// user1.allocate(6000,3000,1000);
		// user1.sip("FEBRUARY");	
		// user1.change(0.04,0.1,0.02);
		// user1.getMoney();
		//user1.indexOf(month);
		System.out.println("yoh");
		user1.loopThrough(6000,3000,1000,"JANUARY",0.04,0.1,0.02);
		System.out.println("yoh");
	
	}
}