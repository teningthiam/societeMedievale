package societeMedievale;
import java.util.ArrayList;
import java.util.Random;

public class Royaume {
	private ArrayList<Village> villages;
    private Random random;
    
    public Royaume() {
        villages = new ArrayList<>();
        random = new Random();
    }
    
  public void veillir() {
	
  }
  public void production() {
		  
  }
  public void impot() {
		  
  }
  
  public void ajouterVillage(Village village) {
      villages.add(village);
  }
  public void ajouterHabitants(Roturier r) {
      int indexVillage = random.nextInt(villages.size());
      villages.get(indexVillage).ajouterHabitants( r);
  }
	    
  public void depense(int montant) {
	  
  }
  public String toString() {
	  return "Royaume{" +"villages=" + villages +
              '}';
	  
  }
}
