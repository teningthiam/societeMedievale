package societeMedievale;

import java.util.Scanner;

public class JoueurInteractif implements Joeur{
	private Scanner scanner;

    public JoueurInteractif() {
        this.scanner = new Scanner(System.in);
    }
    public Action prochaineAction(int argent) {
    System.out.println("Veuillez choisir votre action :");
    }
    int choix = scanner.nextInt();
    switch (action) {
        case 1:
            return new action();
        default:
            return null; // Gérer les autres cas selon vos besoins
    }
}
}
