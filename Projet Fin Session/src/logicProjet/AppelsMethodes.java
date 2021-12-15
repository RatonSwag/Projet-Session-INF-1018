package logicProjet;

import java.util.ArrayList;
import java.util.List;

public class AppelsMethodes {
	private String classname;
	private String methodename;
	private String listmethode="";
	private List<MethodeElements> list;
	private List<ClassDeclare>listclass=new ArrayList<ClassDeclare>();
 	public AppelsMethodes() {}
	
	public void addList(String cn,String m) {
		MethodeElements me=new MethodeElements(cn,m);
		list.add(me);
	}
	public void addListClass(String clname,String clvariable) {
		ClassDeclare cd=new ClassDeclare(clvariable,clname);
		listclass.add(cd);
	}
	public void setString() {
		if(list==null) {
		}else if(list.isEmpty()){
			listmethode+="Vide\n";
		}else {
			for(int i=0;i<listclass.size();i++) {
				for(int o=0;o<list.size();o++) {
					if((listclass.get(i).GetClassVariable()).equals(list.get(o).GetClass())) {
						listmethode+="class: "+listclass.get(i).GetClassName()+" methode: "+list.get(o).GetMethode()+"\n";
					}
				}
			}
		}
	}
	public void setClassName(String c) {
		classname=c;
		listmethode+="Pour la class "+classname+", "
				+ "voici, pour chaque méthode d’une classe, "
				+ "la liste des méthodes ainsi que leur class d'appartenance:\n";
	}
	public void setMethodeName(String m) {
		methodename=m;
		list=new ArrayList<MethodeElements>();
		listmethode+="\n"+methodename+":\n";
	}
	public String toString() {
		listclass=new ArrayList<ClassDeclare>();
		return listmethode;
	}
}
