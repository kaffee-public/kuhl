package kaffee.dao;

import java.util.Collection;
import java.util.List;
import kaffee.entities.Entity;

/**
 * .
 * @author ahorvath
 * @param <T>
 */
public interface EntityDao<T extends Entity<? extends Number>> {

	T selectById(Number id);

	List<T> selectByIds(List<? extends Number> ids);

	T persist(T e);

	void persistAll(Collection<T> all);

	void delete(T e);

	void deleteById(Number id);
}
