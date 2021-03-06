package model;

import java.util.ArrayList;
import java.util.Collections;

public class Ship {
	
	public ArrayList<Crew> crew;
	
	public Ship() {
		crew = new ArrayList<Crew>();
	}
	
	public void addCrew(String name, String stat, int comp) {
		Crew newCrew = new Crew(name, stat, comp);
		crew.add(newCrew);
	}
	
	public ArrayList<Crew> getCrew() {
		return crew;
	}
	
	public String[] newName(String data) {
		String [] nameSeparate = data.split("\\ ");
		return nameSeparate;

	}
	
	public int newComp (String data) {
		if(data.equalsIgnoreCase("rat")) {
			return 1;
		} else if(data.equalsIgnoreCase("child") || data.equalsIgnoreCase("woman")) {
			return 2;
		} else if (data.equalsIgnoreCase("man")) {
			return 3;
		} else {
			return 4;
		}
	}
	
	public void sortByCrew() {
		Collections.sort(crew);
	}
	
	public String toString() {
		String msg = "";
		for(int i = 0; i<crew.size(); i++) {
			msg += crew.get(i).getName()+"\n";
		}
		return msg;
	}

}
