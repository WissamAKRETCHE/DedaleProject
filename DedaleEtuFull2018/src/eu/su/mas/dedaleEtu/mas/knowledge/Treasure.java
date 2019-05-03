package eu.su.mas.dedaleEtu.mas.knowledge;

import java.io.Serializable;

import eu.su.mas.dedale.env.Observation;


public class Treasure implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7218045283017511493L;
	
	private int lockpicking = 0;
	private int lockstatus = 1;
	private int strength = 0;
	private Observation type = Observation.NO_TREASURE;
	
	public int getLockpicking() {
		return lockpicking;
	}
	public void setLockpicking(int lockpicking) {
		this.lockpicking = lockpicking;
	}
	public int getLockstatus() {
		return lockstatus;
	}
	public void setLockstatus(int lockstatus) {
		this.lockstatus = lockstatus;
	}
	public int getStrength() {
		return strength;
	}
	public void setStrength(int strength) {
		this.strength = strength;
	}
	public Observation getType() {
		return type;
	}
	public void setType(Observation type) {
		this.type = type;
	}
	
	

}
