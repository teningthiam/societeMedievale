package societeMedievale;

abstract public class Action {
	protected int cout;
	protected String nom;
	
	public Action(int cout, String nom) {
		
		this.cout = cout;
		this.nom = nom;
	}

	abstract public void action(Royaume r, Fabrique f);
}
