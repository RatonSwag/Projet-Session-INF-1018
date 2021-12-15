package logicProjet;

public class MethodeElements {
	private String classe;
	private String methode;
	public MethodeElements(String classe,String methode) {
		this.classe=classe;
		this.methode=methode;
	}
	public String GetClass() {
		return classe;
	}
	public String GetMethode() {
		return methode;
	}
}
