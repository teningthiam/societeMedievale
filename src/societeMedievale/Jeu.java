package societeMedievale;

public class Jeu {
	private Royaume royaume;
    private FabriqueAction fabrique;
    private Joeur joeur;
    
  public void initialize() {
		   
  }
  public static void main(String [] args) {
	Royaume jeu =new Royaume(0,village(),paysan());
  }
}
