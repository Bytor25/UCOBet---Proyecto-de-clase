package co.edu.uco.ucobet.generales.domain.country;

import java.util.UUID;

import co.edu.uco.ucobet.generales.domain.Domain;

public final class CountryDomain extends Domain {
	
	private String name;

	private CountryDomain(final UUID id, final String name) {
		super(id);
		
		setName(name);
	}
	
	public static final CountryDomain create(final UUID id, final String name) {
		return new CountryDomain(id,name);
	}

	// Name
	public final String getName() {
		return name;
	}

	private final void setName(final String name) {
		this.name = name;
	}
	
	
	
}
