package logicProjet;

public class ClassDeclare {
	public String classname;
	public String classvariable;
	public ClassDeclare(String classvariable ,String classname) {
		this.classvariable=classvariable;
		this.classname=classname;
	}
	public String GetClassName() {
		return classname;
	}
	public String GetClassVariable() {
		return classvariable;
	}
}
