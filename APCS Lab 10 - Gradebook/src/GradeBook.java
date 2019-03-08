import java.util.ArrayList;
import java.util.Scanner;

public class GradeBook {
	
	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<String>();
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a list of names, q to quit: ");
		
		boolean done = false;
		while (!done) {
			String input = in.next();
			if(input.equals("q"))
			{
				done = true;
			}
			else
			{
				names.add(input);
			}
		}
		
		ArrayList<Double> finalScores = new ArrayList<Double>();
		for (String name : names) 
		{
			double score = getScores(name, new Scanner(System.in));
			finalScores.add(score);
		}
		
		in.close();
		
		for (int i = 0; i < names.size(); i++) 
		{
			System.out.println(names.get(i) + ": " + finalScores.get(i));
		}
	}
	
	public static double getScores(String name, Scanner in) {
		ArrayList<Double> scores = new ArrayList<Double>();
		System.out.printf("Enter scores for %s, q to quit: ", name);
		while (in.hasNextDouble()) 
		{
			scores.add(in.nextDouble());
		}
		return finalScore(scores);
	}
	
	public static double finalScore(ArrayList<Double> scores) {
		if (scores.size() == 1) 
		{
			return scores.get(0);
		}
		return sum(scores) - minimum(scores);
	}
	
	public static double minimum(ArrayList<Double> scores) {
		if (scores.size() == 0) 
		{
			return 0;
		}
		double min = scores.get(0);
		for (int i = 1; i < scores.size(); i++) 
		{
			if (scores.get(i) < min) 
			{
				min = scores.get(i);
			}
		}
		return min;
	}
	
	public static double sum(ArrayList<Double> scores) {
		double sum = 0;
		for (double score : scores) 
		{
			sum += score;
		}
		return sum;
	}
	
}
