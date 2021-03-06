package logicProjet;

import java.util.ArrayList;

public class ReverseEngineering {
	private ArrayList<String> inherited;
	private ArrayList<String> associated;

	private boolean CalledParent;
	private boolean CalledAssociation;

	public ReverseEngineering() {
		this.inherited = new ArrayList<String>();
		this.associated = new ArrayList<String>();

		this.CalledParent = false;
		this.CalledAssociation = false;
	}

	public void Add(String name) {
		if (CalledParent) {
			inherited.add(name);
			CalledParent = false;
			CalledAssociation = false;
		} else if (CalledAssociation) {
			boolean isAssociated = false;
			// Fais le tour de la liste pour v?rifier si la nom est d?ja dedans
			for (String s : associated) {
				if (s.equals(name)) {
					isAssociated = true;
					break;
				}
			}

			if (!isAssociated) {
				associated.add(name);
			}
			CalledParent = false;
			CalledAssociation = false;
		}
	}

	public void CallParent() {
		this.CalledParent = true;
	}

	public void CallAssociation() {
		this.CalledAssociation = true;
	}

	public void Print() {
		System.out.println("--La classe h?rite de: ");
		if (inherited.size() == 0) {
			System.out.println("La classe n'h?rite d'aucune classe ou interface");
		}
		for (String s : inherited) {
			System.out.println(s);
		}

		System.out.println("\n--La classe est associ?e ?: ");
		if (associated.size() == 0) {
			System.out.println("La classe n'est associ?e ? aucune autre classe");
		}
		for (String s : associated) {
			System.out.println(s);
		}
	}
}
