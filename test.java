package test;

public class testBox {
	public static void main(String[] args) {
		Finch birb = new Finch();
		int dist = birb.getDistance();
		while (dist>20) {
			birb.setMotors(20,20);
			dist = birb.getDistance();
			System.out.println(dist);
		}
		birb.setMotors(0,0);
		birb.playNote(60,0.5);
		
		birb.stopAll();
		birb.disconnect();
	}
	
}
