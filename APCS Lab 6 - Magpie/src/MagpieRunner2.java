import java.util.Scanner;

/**
 * A simple class to run the Magpie class.
 * @author Laurie White
 * @version April 2012
 */
public class MagpieRunner2
{

	/**
	 * Create a Magpie, give it user input, and print its replies.
	 */
	public static void main(String[] args)
	{
		Magpie2 maggie = new Magpie2();
		
		System.out.println (maggie.getGreeting());
		Scanner in = new Scanner (System.in);
		String statement = in.nextLine();
		
		while (!statement.equals("Bye"))
		{
			System.out.println (maggie.getResponse(statement));
			statement = in.nextLine();
		}
	}

}

/*
Answers to lab questions (Using Elbot):
- Answer to "where do you come from": Most of my parts can be bought at better-stocked hardware stores and assembled by a typical high-school student.
= Most interesting response: Human beings have a strange criterion for what is meaningful. If I started to worry about that life would lose all meaning for me.
- Most peculiar response: Your teacher wants to get rid of you. After a chat with me, you will be ready to graduate!
- Answer to "asdfghjkl;": I'm starting to wonder: Who convinced you to come visit me?

1. "Yes", "no", "good", "fun", "right", "wrong", "die", "shut down", "wake up"
2. Yes and right cause a positive response, often celebrating an agreement.
No and wrong cause a negative response, often lamenting a disagreement.
Fun causes a random sentence to return containing the word fun.
Die causes the robot to become unresponsive.
Shut down causes to robot to undergo sleeping dialogues for two rounds.
Wake up causes the robot to talk about waking up.

Answers to lab questions (Using Magpie):
- Answer to "My mother and I talked last night": Tell me more about your family.
- Answer to "I said no!": Why so negative?
- Answer to "The weather is nice.": Interesting, tell me more.
- Answer to "Do you know my brother?": Why so negative?

- Keyword: yes Response: Positivity can be naive.
- Keyword: java Response: I've never tasted it.
- Keyword: robot Response: I'm not a robot, I'm real.
- Whichever keyword appears first in the if...else if...else section will be responded to first.
For instance, "My mother has a dog but no cat" would return the "no" response because the "no"
if statement is first in that section.

1. When a keyword is included in another word, the chatbot will still respond as if the keyword were
included by itself. This is a problem because if you say something like "I know all the state capitals",
with the keyword "no" in "know", the chatbot will respond "Why so negative?" which makes no sense as
"know" means a completely different thing from "no". If you enter "I like vegetables smothered in
cheese", the chatbot will respond with "Tell me more about your family," which again, makes no sense
because there is no mention of family even though "mother" is included in "smothered".
*/