package studio2;

public class Pi {

	public static void main(String[] args) {
		int hitCirc = 0;
		int hitNotCirc = 0;
		
		for(int i=1 ; i == 20; i++) {
			double a = 2*(Math.random() - 0.5);
			double b = 2*(Math.random() - 0.5);
			if (Math.sqrt(Math.pow(a,2) + Math.pow(b, 2))<=1) {
				hitCirc++;
			}
			else {
				hitNotCirc++;
			}
		
		System.out.println("Pi: "+ (4*hitCirc)/(hitCirc+hitNotCirc));
		}
		

	}

}
