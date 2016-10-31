package kaffee.entities;

public interface NamedEntity<K> extends UniqueEntity<K> {

	String getName();

	void setName(String name);
}
