class Dealer
{
	public static void main(String[] args)
	{
		Deck madeDeck = new Deck();									              // Create the empty deck
		Card chosenCard = new Card(0, 0);							            // Create a blank card to be used as a place holder for the top card of the deck
		
		for(int suit = 0; suit < 4; suit++)							          // Create all the cards
		{
			for(int rank = 0; rank < 13; rank++)
			{
				Card madeCard = new Card(rank, suit);				          // Create a new card with the current rank & suit
				madeDeck.putCard(madeCard);							              // Put the newly created card on the top of the deck
			}
		}
		madeDeck.shuffle();											                  // Shuffle the deck
		for(int cardCounter = 0; cardCounter < 4; cardCounter++)	// Deal 4 cards
		{
			chosenCard.printCard(madeDeck.getTop());				        // Get the card off the top of the deck
		}
	}
}
