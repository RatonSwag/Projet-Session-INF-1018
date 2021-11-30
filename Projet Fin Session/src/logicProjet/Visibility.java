package logicProjet;

public class Visibility {
	private int typesimple;
	private int reference;
	private String texte= "\nVoici la liste des classes vis-à-vis desquelles elle a une visibilité permanente:";
	public Visibility() {
		typesimple=0;
		reference=0;
	}
	
	public void augmentTypesimple() {
		typesimple++;
		System.out.println("type simple nombre: "+typesimple);
	}
	public void augmentReference() {
		reference++;
		System.out.println("type reference nombre: "+reference);
	}
	public void ajouterClassRef(String s) {
		texte+="\n"+s;
		System.out.println(s);
	}
	
	public String toString() {
		int tot=typesimple+reference;
		return "Pourcentage des attributs de type simple: "+typesimple*100/tot+"%"+
				"\nPourcentage des attributs de type simple: "+reference*100/tot+"%"+
				texte;
	}
}
