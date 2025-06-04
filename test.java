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



package test;

public class point {
	
	public static void main(String[] args) {
		Finch f1 = new Finch();
		
		for(int i=0;i<10;i++) {
			System.out.println(f1.getMagnetometer());
			
		}
		
		f1.stop();
		f1.disconnect();
	}
	
}

