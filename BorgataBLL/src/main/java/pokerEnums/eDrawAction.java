package pokerEnums;


public enum eDrawAction {

	DrawPlayer(1),
	DrawCommon(2);
	
	private int DrawAction;

	private eDrawAction(final int DrawAction){
		this.DrawAction = DrawAction;
	}
	
	public int getDrawAction(){
		return DrawAction;
	}
}
