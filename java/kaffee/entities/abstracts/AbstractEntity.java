package kaffee.entities.abstracts;

import javax.persistence.Column;
import javax.persistence.Id;
import kaffee.entities.Entity;

/**
 * .
 * @author ahorvath
 * @param <K>
 */
public abstract class AbstractEntity<K extends Number> implements Entity<K> {

	@Id
	@Column(name = "id")
	private Number id;
	@Column(name = "info")
	private String info;

	@Override
	public K getId() {
		return (K) id;
	}

	@Override
	public String getInfo() {
		return info;
	}

	@Override
	public void setId(K id) {
		this.id = id;
	}

	@Override
	public void setInfo(String info) {
		this.info = info;
	}

	@Override
	public int compareTo(K o) {
		int ret;
		if (id != null) {
			if (o != null) {
				ret = Long.compare(id.longValue(), o.longValue());
			} else {
				ret = 1;
			}
		} else {
			if (o != null) {
				ret = -1;
			} else {
				ret = 0;
			}
		}
		return ret;
	}
}
