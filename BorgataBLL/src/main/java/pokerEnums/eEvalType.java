package pokerEnums;


public enum eEvalType {

	Normal(1),
	TexasHoldEm(2),
	Omaha(3),
	SevenCard(4);
	
	private int EvalAction;

	private eEvalType(final int EvalAction){
		this.EvalAction = EvalAction;
	}
	
	public int getEvalAction(){
		return EvalAction;
	}
}
