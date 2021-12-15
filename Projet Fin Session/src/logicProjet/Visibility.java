package logicProjet;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Visibility {
	private int typesimple;
	private int reference;
	private ArrayList <String> classvisibility= new ArrayList<String>();
	private String texte= "\nVoici la liste des classes vis-à-vis desquelles elle a une visibilité permanente:";
	public Visibility() {
		typesimple=0;
		reference=0;
	}
	
	public void augmentTypesimple() {
		typesimple++;
		//System.out.println("type simple nombre: "+typesimple);
	}
	public void augmentReference() {
		reference++;
		//System.out.println("type reference nombre: "+reference);
	}
	public void ajouterClassRef(String s) {
		classvisibility.add(s);
	}
	
	public String toString() {
		int tot=typesimple+reference;
		ArrayList<String> newList = (ArrayList<String>) classvisibility.stream()
                .distinct()
                .collect(Collectors.toList());
		newList.forEach((n)->texte+="\n"+n);
		return "Pourcentage des attributs de type simple: "+typesimple*100/tot+"%"+
				"\nPourcentage des attributs de type reference: "+reference*100/tot+"%"+
				texte;
	}
}
