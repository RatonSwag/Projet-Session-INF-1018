package logicProjet;

import java.util.*;

public class CouplingCounter {

	private ArrayList<String> calledClasses;
	private HashMap<String, String> assignedNames;

	private boolean called;

	private String lastClass;
	private String name;

	public CouplingCounter() {
		this.calledClasses = new ArrayList<String>();
		this.assignedNames = new HashMap<String, String>();
		called = false;
	}

	public void SetLastName(String name) {
		this.name = name;
	}

	public void SetLastClass(String last) {
		if (this.called) {
			this.lastClass = last;
			this.called = false;
		}
	}

	public void AssignNameToClass() {
		assignedNames.put(name, lastClass);
	}

	public void Call() {
		this.called = true;
	}

	public void Uncall() {
		this.called = false;
	}

	public void AddCalled() {
		this.calledClasses.add(this.lastClass);
	}

	public void AddCalled(String name) {
		if (assignedNames.containsKey(name)) {
			this.calledClasses.add(assignedNames.get(name));
		}
	}

	public void printCalled() {
		System.out.println("\nClasses appelées: ");
		if (calledClasses.size() != 0) {
			ArrayList<String> distinctCalled = new ArrayList<String>();

			// Remplis la liste distincte d'éléments distincts
			for (String k : this.calledClasses) {
				if (!distinctCalled.contains(k)) {
					distinctCalled.add(k);
				}
			}

			
			for (String s : distinctCalled) {
				System.out.println(s + ": " + Collections.frequency(calledClasses, s));
			}
		}
		else {
			System.out.println("Aucune classe appelée");
		}

	}
}
