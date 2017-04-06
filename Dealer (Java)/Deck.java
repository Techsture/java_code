import java.util.Random;
import java.util.ArrayList;

public class Deck
{
	private ArrayList<Card> mDeckArray = new ArrayList<Card>();
	
	public Deck()
	{
		
	}
	
	public void putCard(Card passedCard)
	{
		mDeckArray.add(passedCard);
	}
	
	public void shuffle()
	{
		Card tempCard = new Card(0, 0);
		Random randomGenerator = new Random();
		int randomNumber = 0;
		for(int position = 0; position < 52; position++)				    // Go through the deck and swap the positions of random cards
		{
			tempCard = mDeckArray.get(position);						          // Save the current card to a temporary space
			randomNumber = randomGenerator.nextInt(52);					      // Choose an integer between 0 and 51
			mDeckArray.set(position, mDeckArray.get(randomNumber));   // Copy the randomly chosen card to the current position
			mDeckArray.set(randomNumber, tempCard);						        // Copy the card saved to temporary space to the position of the randomly chosen card
		}
	}
	
	public Card chooseCard(int position)
	{
		Card chosenCard = new Card(0, 0);
		chosenCard = mDeckArray.remove(position);						        // Copy the card off the ArrayList
		return chosenCard;
	}
	
	public Card getTop()
	{
		return mDeckArray.remove(0);									              // Take the top card off the deck 
	}
}
