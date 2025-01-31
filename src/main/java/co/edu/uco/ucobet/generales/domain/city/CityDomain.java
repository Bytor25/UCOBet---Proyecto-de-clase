package co.edu.uco.ucobet.generales.domain.city;

import java.util.UUID;

import co.edu.uco.ucobet.generales.domain.Domain;
import co.edu.uco.ucobet.generales.domain.state.StateDomain;

public final class CityDomain extends Domain {
	
	private String name;
	private StateDomain state;

	private CityDomain(final UUID id, final String name,final StateDomain state) {
		super(id);
		setName(name);
		setState(state);
	}
	
	public static final CityDomain create(final UUID id, final String name, final StateDomain state) {
		return new CityDomain(id,name,state);
	}

	// Name
	public final String getName() {
		return name;
	}

	private final void setName(final String name) {
		this.name = name;
	}
	
	// State
	public final StateDomain getState() {
		return state;
	}

	private final void setState(final StateDomain state) {
		this.state = state;
	}
	
	

}
