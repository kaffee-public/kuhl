package kaffee.entities.abstracts;

import javax.persistence.Column;
import kaffee.entities.UniqueEntity;

/**
 * .
 * @author ahorvath
 * @param <K>
 */
public class AbstractUniqueEntity<K extends Number> extends AbstractEntity<K> implements UniqueEntity<K> {

	@Column(name = "sid", nullable = false, unique = true)
	private String sid;

	@Override
	public String getSid() {
		return sid;
	}

	@Override
	public void setSid(String sid) {
		this.sid = sid;
	}
}
