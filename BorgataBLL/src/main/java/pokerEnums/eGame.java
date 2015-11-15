package pokerEnums;

import java.util.ArrayList;

public enum eGame {

	FiveStud(1),
	FiveStudOneJoker(2),
	FiveStudTwoJoker(3),
	TexasHoldEm(4),
	Omaha(5),
	DeucesWild(6),
	AcesAndEights(7),
	SevenDraw(8);
	
	private int gameNbr;

	private eGame(final int gameNbr){
		this.gameNbr = gameNbr;
	}
	
	public int getGame(){
		return gameNbr;
	}
	
	public static eGame fromInt(int x){
		switch(x){
		case 1:
			return FiveStud;
		case 2:
			return FiveStudOneJoker;
		case 3:
			return FiveStudTwoJoker;
		case 4:
			return TexasHoldEm;
		case 5:
			return Omaha;
		case 6:
			return DeucesWild;
		case 7:
			return AcesAndEights;
		case 8:
			return SevenDraw;	
		}
		return null;
	}
}
