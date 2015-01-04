package kaffee.entities.abstracts;

import javax.persistence.Column;
import kaffee.entities.NamedEntity;

/**
 * .
 * @author ahorvath
 * @param <T>
 */
public class AbstractNamedEntity<T extends AbstractNamedEntity> extends AbstractUniqueEntity<T>
	implements NamedEntity {

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
