package kaffee.entities;

/**
 * .
 * @author ahorvath
 * @param <K> Primary-key type.
 */
public interface Entity<K> extends Comparable<K> {

	K getId();

	void setId(K id);

	String getInfo();

	void setInfo(String info);
}
