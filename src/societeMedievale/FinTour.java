package societeMedievale;

public class FinTour extends Action{
  private Action[] listes;
public FinTour() {
	  super(0,"FinTour");
  }
   public void action(Royaume r, Fabrique f) {
	  
  }
  boolean actionCorrecte(String nom) {
	  listes = null;
	for (Action action : listes) {
          if (action.nom.equals(nom)) {
              return true;
          }
      }
	return false;
  }
}
