package kaffee.entities.abstracts;

import javax.persistence.Column;
import kaffee.entities.NamedEntity;

/**
 * .
 * @author ahorvath
 * @param <K>
 */
public class AbstractNamedEntity<K extends Number> extends AbstractUniqueEntity<K>
	   implements NamedEntity<K> {

	@Column(name = "name")
	private String name;

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}
}
