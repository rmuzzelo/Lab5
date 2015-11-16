package pokerBase;

import java.util.ArrayList;
import java.util.Collections;

public class GamePlayPlayerHand {

	private GamePlay game = null;
	private Player player = null;
	private Hand hand = null;
	
	private Player WinningPlayer = null;
	
	public GamePlayPlayerHand() {
	
	}

	public GamePlay getGame() {
		return game;
	}

	public void setGame(GamePlay game) {
		this.game = game;
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public Hand getHand() {
		return hand;
	}

	public void setHand(Hand hand) {
		this.hand = hand;
	}

	public void addCardToHand( Card c)
	{
		getHand().AddCardToHand(c);
	}
	
	public static Hand TexasHands(ArrayList<Card> CommunityCards, ArrayList<Card> CardsInHand1) {
		ArrayList<Hand> possible = new ArrayList<Hand>();
		ArrayList<Card> h = new ArrayList<Card>();
		for (Card i :CardsInHand1){
			h.add(i);
		}
		for (Card j :CommunityCards){
			h.add(j);
		}
		
		for (int k=0; k<h.size();k++){
			for(int j=k+1; j<h.size();j++){
				for(int g=j+1; g<h.size();g++){
					for(int f=g+1;f<h.size();f++){
						for (int d=f+1;d<h.size();d++){
							Hand v = new Hand();
							v.AddCardToHand(h.get(d));
							v.AddCardToHand(h.get(f));
							v.AddCardToHand(h.get(g));
							v.AddCardToHand(h.get(j));
							v.AddCardToHand(h.get(k));
							possible.add(v);
						}
					}
				}	
			}
		}
		
		for (Hand EvalHand : possible) {
			EvalHand.EvalHand();
		}

		Collections.sort(possible, Hand.HandRank);

		return possible.get(0);		
	}
	
	public static Hand OmahaHands(ArrayList<Card> CommunityCards, ArrayList<Card> CardsInHand2) {
		ArrayList<Hand> possible = new ArrayList<Hand>();
		
		for (Card i :CardsInHand2){
		}
		for (Card j :CommunityCards){
		}
		for (Hand EvalHand : possible) {
			EvalHand.EvalHand();
		}

		Collections.sort(possible, Hand.HandRank);

		return possible.get(0);		
	}
	
	public Player getWinningPlayer() {
		return WinningPlayer;
	}

	public void setWinningPlayer(Player winningPlayer) {
		WinningPlayer = winningPlayer;
	}

	
}
