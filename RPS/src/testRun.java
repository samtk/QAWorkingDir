import java.util.Scanner;

public class testRun {

	static double totalgamesplayed, computerwins, humanwins, ties;
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Type Rock, Paper or Scissors");

		
		while(true) {
			String input = sc.nextLine();
			String ai = generateAiResponse();
			String result = readInput(input, ai);
			if(result.equals("quit")) break;
			if(result.equals("Could not read command")) {
				System.out.println(result);
				continue;
			}
			
			trackStatistics(result);
			System.out.println("Computer Picks " + ai);
			System.out.println("You "+result + "!");
			System.out.println("Try Again?");
			System.out.println("Total games played: " + totalgamesplayed);
			double winpercentage= (double) (humanwins/totalgamesplayed) * 100;
			double computerwinpercentage= 100-winpercentage;//(double) (computerwins/totalgamesplayed) * 100;
			System.out.println("Number of wins: " + humanwins + " win percentage: " + Math.round(winpercentage) + "%" );
			System.out.println("Number of losses: " + computerwins + " computer win percentage: " + Math.round(computerwinpercentage) + "%");
			System.out.println("Number of draws: " + ties);
			
			System.out.println();
		}
		
		
		sc.close();	

	}
	
	public static String generateAiResponse() {
		int num = (int) (Math.random() * 3); 
		String response = "";
		switch(num){
			case(0): response = "paper"; break;
			case(1): response = "scissor"; break;
			case(2): response = "rock"; break;
		}
		return response;
	}
	
	
	public static String readInput(String input, String ai) {
		switch(input.toLowerCase()) {
			case("paper"): 
				if(ai.equals("paper")) return "Draw";
				if(ai.equals("scissor")) return "Lose";
				if(ai.equals("rock")) return "Win";
				break;
			case("scissor"): 
				if(ai.equals("paper")) return "Win";
				if(ai.equals("scissor")) return "Draw";
				if(ai.equals("rock")) return "Lose";
				break;
			case("rock"):
				if(ai.equals("paper")) return "Lose";
				if(ai.equals("scissor")) return "Win";
				if(ai.equals("rock")) return "Draw";
				break;
			case("quit"):
				return "quit";
			default:
				return "Could not read command";
		}
		return "";
	}
	

	
	
	
	public String compare(String hand1, String hand2) 
	{
		if(hand1 == "paper" && hand2 == "paper") return "paper";
		if(hand1 == "rock" && hand2 == "paper") return "paper";
		if(hand1 == "scissor" && hand2 == "paper") return "scissor";
		if(hand1 == "rock" && hand2 == "Rock") return "rock";
		if(hand1 == "scissor" && hand2 == "Rock") return "rock";
		if(hand1 == "scissor" && hand2 == "scissor") return "scissor";
		return "";
	}
	
	
	public static void trackStatistics(String result) {
		totalgamesplayed++;
		switch(result) {
			case("Win"):
				humanwins++; break;
			case("Draw"):
				ties++; break;
			case("Lose"):
				computerwins++; break;
		}
		
	}
	
	


}
