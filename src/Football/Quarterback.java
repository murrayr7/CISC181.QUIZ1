package Football;

import java.util.Scanner;

public class Quarterback {
	
	private int TD;
	private int Yards;
	private int INT;
	private int comp;
	private int ATT;
	private String name;
	
	static Scanner userinput = new Scanner(System.in);
	
	public Quarterback(){
		
	}

	public int getTD() {
		return TD;
	}

	public void setTD(int tD) {
		TD = tD;
	}

	public int getYards() {
		return Yards;
	}

	public void setYards(int yards) {
		Yards = yards;
	}

	public int getINT() {
		return INT;
	}

	public void setINT(int iNT) {
		INT = iNT;
	}

	public int getComp() {
		return comp;
	}

	public void setComp(int comp) {
		this.comp = comp;
	}

	public int getATT() {
		return ATT;
	}

	public void setATT(int aTT) {
		ATT = aTT;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double QBR(){
		double a = ( ((double)this.comp/this.ATT) -.3)*5;
		double b = (((double)this.Yards/this.ATT)-3)*.25;
		double c = ((double)this.TD*20/this.ATT);
		double d = (2.375-((double)this.INT*25/this.ATT));
		double qbr = (  ( Math.max(0, Math.min(a, 2.375)) + Math.max(0, Math.min(b, 2.375)) + Math.max(0, Math.min(c, 2.375)) + Math.max(0, Math.min(d, 2.375)) )/6 )*100;
		return qbr;
	}
	
	public static void main(String[] args){
		Quarterback TheQuarterback = new Quarterback();
		System.out.println("What is the Quarterback's name?");
		TheQuarterback.setName(userinput.nextLine());
		System.out.println("How many passes did the quarterback attempt?");
		TheQuarterback.setATT(userinput.nextInt());
		System.out.println("How many completions did the quarterback have?");
		TheQuarterback.setComp(userinput.nextInt());
		System.out.println("How many Interceptions did the quarterback throw?");
		TheQuarterback.setINT(userinput.nextInt());
		System.out.println("How many Touchdowns did the quarterback throw?");
		TheQuarterback.setTD(userinput.nextInt());
		System.out.println("How Total Yards did the quarterback throw for?");
		TheQuarterback.setYards(userinput.nextInt());
		System.out.printf("%s had a qbr of %.1f",TheQuarterback.getName(), TheQuarterback.QBR());
	}
	
	
}
