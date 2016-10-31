package kaffee.entities;

/**
 * .
 * @author ahorvath
 * @param <K> .
 */
public interface UniqueEntity<K> extends Entity<K> {

	String getSid();

	void setSid(String sid);
}
