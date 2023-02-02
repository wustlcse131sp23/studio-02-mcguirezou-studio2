package studio2;

import java.util.Scanner;
public class Ruin {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);  
		
		System.out.println("Please Enter starting money: ");
        int startAmount = in.nextInt();
        System.out.println("Please Enter win probability: ");
        double winChance = in.nextDouble();
        System.out.println("Please Enter win limit monetary amount: ");
        int winLimit = in.nextInt();
        boolean roundOutcome = true;
        System.out.println("Please Enter the number of days you want to play: ");
        int totalSimulations = in.nextInt();
        int ruins = 0;
        int wins = 0;
        
        for(int numberOfDays = 1; numberOfDays < (totalSimulations + 1); numberOfDays++)
        {
        	int numberOfPlays = 0;
        	int changeMoney = 0;
        while ((changeMoney + startAmount) < winLimit && (startAmount + changeMoney) > 0) {
        	double roundChance = Math.random();
        		if (roundChance < winChance) {
        			changeMoney++;
        			roundOutcome = true;
        			numberOfPlays++;
        		}
        		else {
        			changeMoney--;
        			roundOutcome = false;
        			numberOfPlays++;
        		}
        	
        }
        
        if ((changeMoney + startAmount) == winLimit) {
            System.out.println("Day number: " + numberOfDays + " " + numberOfPlays + " WIN");
        	wins++;
        }
        else {
            System.out.println("Day number: " + numberOfDays + " " + numberOfPlays + " LOSE");
        	ruins++;
        }

        }
        System.out.println("Losses: " + ruins + " Simulations: " + totalSimulations);
        
        if (winChance == 0.5) {
        	double expectedRuin = 1 - (startAmount/winLimit);
        	System.out.println("Ruin Rate form simulation: " + (ruins/totalSimulations)+ " Expected Ruin Rate: " + expectedRuin);
        }
        else {
        	double a = (1 - winChance)/winChance;
        	double expectedRuin = (Math.pow(a, startAmount)-Math.pow(a, winLimit))/(1-Math.pow(a, winLimit));
        	System.out.println("Ruin Rate form simulation: " + (ruins/((double)totalSimulations))+ " Expected Ruin Rate: " + expectedRuin);
        }
        
    }
}
	


