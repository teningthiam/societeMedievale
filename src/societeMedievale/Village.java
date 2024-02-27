package societeMedievale;
import java.util.ArrayList;
import java.util.Iterator;

public class Village {
	private ArrayList<Roturier> roturiers = new ArrayList<>
	();
	public void vieillir() {
	for (Iterator<Roturier> iterator = roturiers.iterator(); iterator.hasNext(); ) {
	Roturier roturier = iterator.next();
	roturier.veillir();
	if (roturier.veillir()) {
	iterator.remove();
	}
	}
	}
	public int production() {
	int totalProduction = 0;
	for (Roturier roturier : roturiers) {
	totalProduction += roturier.production();
	}
	return totalProduction;
	}
	public int impot() {
	int totalImpot = 0;
	for (Roturier roturier : roturiers) {
	totalImpot += roturier.payerImpot();
    }
	return totalImpot;
    }
	public void ajouterHabitants(Roturier r) {
		// TODO Auto-generated method stub
		
	}
}

