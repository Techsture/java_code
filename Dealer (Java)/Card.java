
public class Card
{
	char mCardRank = 0;
	char mCardSuit = 0;
	
	public Card(int passedRank, int passedSuit)
	{
		switch (passedRank)								          // Convert the passed rank to a character
		{
			case 0:		mCardRank = 'A'; break;
			case 1:		mCardRank = '2'; break;
			case 2:		mCardRank = '3'; break;
			case 3:		mCardRank = '4'; break;
			case 4:		mCardRank = '5'; break;
			case 5:		mCardRank = '6'; break;
			case 6:		mCardRank = '7'; break;
			case 7:		mCardRank = '8'; break;
			case 8:		mCardRank = '9'; break;
			case 9:		mCardRank = 'T'; break;
			case 10: 	mCardRank = 'J'; break;
			case 11: 	mCardRank = 'Q'; break;
			case 12: 	mCardRank = 'K'; break;
		}
		switch (passedSuit)								          // Convert the passed suit to a character
		{
			case 0:		mCardSuit = '\u2660'; break;		// Spade
			case 1:		mCardSuit = '\u2661'; break;		// Heart
			case 2:		mCardSuit = '\u2662'; break;		// Diamond
			case 3:		mCardSuit = '\u2663'; break;		// Club
		}
	}
	
	public char[][] getCard()
	{
		char cardRankAndSuit[][] = new char[1][2];
		cardRankAndSuit[0][0] = mCardRank;
		cardRankAndSuit[0][1] = mCardSuit;
		return cardRankAndSuit;
	}
	
	public void printCard(Card chosenCard)
	{
		System.out.println("Revealed card is: " + chosenCard.mCardRank + chosenCard.mCardSuit);
	}
}
