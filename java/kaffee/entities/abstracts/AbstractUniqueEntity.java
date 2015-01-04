package kaffee.entities.abstracts;

import javax.persistence.Column;
import kaffee.entities.UniqueEntity;

/**
 * .
 * @author ahorvath
 * @param <T>
 */
public class AbstractUniqueEntity<T extends AbstractUniqueEntity> extends AbstractEntity<T> implements UniqueEntity {

	@Column(name = "sid", nullable = false)
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
