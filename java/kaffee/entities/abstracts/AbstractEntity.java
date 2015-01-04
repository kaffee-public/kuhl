package kaffee.entities.abstracts;

import javax.persistence.Column;
import javax.persistence.Id;
import kaffee.entities.Entity;

/**
 * .
 * @author ahorvath
 * @param <T>
 */
public abstract class AbstractEntity<T extends AbstractEntity> implements Entity {

	@Id
	@Column(name = "id")
	private Long id;
	@Column(name = "info")
	private String info;

	@Override
	public Long getId() {
		return id;
	}

	@Override
	public String getInfo() {
		return info;
	}

	@Override
	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public void setInfo(String info) {
		this.info = info;
	}
}
