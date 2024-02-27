package societeMedievale;

import java.util.ArrayList;
import java.util.List;

public class FabriqueAction {
	protected List<Action> liste=new ArrayList<>();

	public FabriqueAction() {
		liste.add(new AchatPaysan());
		liste.add(new Impot());
	}
	
}
