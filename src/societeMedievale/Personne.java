package societeMedievale;


public class Personne {
	
	    protected int age;
	    protected int pdv; 

	    public Personne() {
	        this.age = 0;
	        this.pdv = 100;
	    }

	    public boolean veillir() {
	        this.age++;
	        if (this.age > 70 || this.pdv <= 0) {
	            System.out.println("Une personne est décédée.");
	            this.pdv = 0;
	        }
			return false;
	    }

	    public int getAge() {
	        return age;
	    }

	    public int getPdv() {
	        return pdv;
	    }

	    public void setPdv(int pdv) {
	        this.pdv = pdv;
	    }
	}


