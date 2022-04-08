import java.util.*;

public class Money{
	private int equity;
	private int debt;
	private int gold;
	public String [] month = {"JANUARY","FEBRUARY","MARCH","APRIL","MAY","JUNE"};

	public void allocate(int eq,int deb,int go){
		equity = eq;
		debt = debt;
		gold = go;
	}

	public void sip(String mon){
		if(mon == month[1]){
			equity += 2000;
			debt += 1000;
			gold += 500;
		}else{
			System.out.println("It is allocation time");
		}
	}

	public void change(double eq, double deb,double go){
		double one = (eq * equity);
		equity += one; 
		double two =  (deb * debt);
		debt += two;
		double three =  (go * gold);
		gold += three; 
	}

	public void loopThrough(int eq,int deb,int go,String start,double equ, double debi,double gol){
		for(int i = 0;i < 5;i++){
			if(start == month[0]){
				allocate(eq,deb,go);
				//sip(month[i]);
				getMoney();
				change(equ,debi,gol);
				getMoney();
			}else{
				sip(month[i]);
				getMoney();
				change(equ,debi,gol);
				getMoney();
			}
		}
	}

	public void getMoney(){
		System.out.println("Equity: "+equity+"\nDebt: "+debt+"\nGold: "+gold);
	}
}