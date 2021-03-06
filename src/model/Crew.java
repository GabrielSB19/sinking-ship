package model;

public class Crew implements Comparable<Crew>{
	
	private String name;
	private String stat;
	private int comp;
	
	public Crew (String name, String stat, int comp) {
		this.name = name;
		this.stat =  stat;
		this.comp = comp;
	}
	
	public String getName() {
		return name;
	}
	
	public String getStat () {
		return stat;
	}
	
	public int getComp() {
		return comp;
	}

	@Override
	public int compareTo(Crew otherCrew) {
		return comp - otherCrew.getComp();
	}
}
