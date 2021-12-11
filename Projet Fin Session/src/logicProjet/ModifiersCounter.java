package logicProjet;

public class ModifiersCounter {
	private int nbrPublic;
	private int nbrPrivate;
	private int nbrProtected;
	
	private int modifierType;
	
	private boolean isVariable;
	private String nameOfClass;
	
	
	public ModifiersCounter() {
		this.nbrPublic = 0;
		this.nbrPrivate = 0;
		this.nbrProtected = 0;
		this.isVariable = false;
	}
	
	public void SetModifierType(int i) {
		this.modifierType = i;
	}
	
	public void SetName(String nom) {
		this.nameOfClass = nom;
	}
	
	public void AddModifier() {
		switch(this.modifierType) {
		case 0:{
			this.nbrPublic++;
			break;
		}
		case 1:{
			this.nbrPrivate++;
			break;
		}
		case 2:{
			this.nbrProtected++;
			break;
		}
		}
	}
	
	public void AddPublic() {
		nbrPublic++;
		this.isVariable = false;
	}
	
	public void AddPrivate() {
		nbrPrivate++;
		this.isVariable = false;
	}
	
	public void AddProtected() {
		nbrProtected++;
		this.isVariable = false;
	}
	
	public boolean GetIsVariable() {
		return this.isVariable;
	}
	
	public void SetIsVariable() {
		this.isVariable = true;
	}
	
	public void ToString() {
		
		System.out.println(this.nameOfClass + ": ");
		int total = this.nbrPublic + this.nbrPrivate + this.nbrProtected;
		if(total != 0) {
			double percentPublic = (double) this.nbrPublic / (double) total;
		
		System.out.println("Public: " + (((double) this.nbrPublic / (double) total) * 100) + "%");
		System.out.println("Private: " + (((double) this.nbrPrivate / (double) total) * 100) + "%");
		System.out.println("Protected: " + (((double) this.nbrProtected / (double) total) * 100) + "%");
		}
		else {
			System.out.println("Aucune variable déclaré avec les modifieurs recherchés");
		}
	}
}
