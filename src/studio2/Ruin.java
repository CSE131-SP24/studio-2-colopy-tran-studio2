package studio2;

public class Ruin {

	public static void main(String[] args) {
		
		double startAmount = 5;
		double winChance = 0.5;
		double winLimit = 10.0;
		int tries = 0;
		int totalSimulations = 5;
		
		double money = startAmount;
		
		for(int i=1; i <=totalSimulations; i+=1) {
			money=startAmount;
			while ( money > 0 && money < winLimit) {
			
				if(Math.random() > winChance) {
					money -= 1;
					System.out.println("loss");
					tries += 1;	
				
				}
				else {
					money += 1;
					System.out.println("win");
					tries += 1;
				}



		}
		if(money == 0) {
			System.out.println("FAILURE");
		}
		else {
			System.out.println("SUCCESS");
		}

		System.out.println(tries);
		System.out.println(i);
		
		}
	}

}
