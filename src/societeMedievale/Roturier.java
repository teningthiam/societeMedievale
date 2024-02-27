package societeMedievale;

public class Roturier extends Personne {
    protected int argent;

    public Roturier() {
        this.argent = 50;
    }

    public int production() {
        return argent / 10; 
    }

    public int getArgent() {
        return argent;
    }

    public void setArgent(int argent) {
        this.argent = argent;
    }

    public void impot(int montant) {
        argent -= montant;
    }

	public int payerImpot() {
		// TODO Auto-generated method stub
		return 0;
	}

	
}

