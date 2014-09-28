package Football;
public class NickFoles {
	public static void main(String[] args){
		//Evaluating Nick Foles qbr
		Quarterback TrickyNick = new Quarterback();
		TrickyNick.setATT(317);
		TrickyNick.setComp(203);
		TrickyNick.setINT(2);
		TrickyNick.setTD(27);
		TrickyNick.setYards(2891);
		TrickyNick.setName("Nick Foles");
		System.out.printf("%s had a qbr of %.1f",TrickyNick.getName(), TrickyNick.QBR());
	}
}
