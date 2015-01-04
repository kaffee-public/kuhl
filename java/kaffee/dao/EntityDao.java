package kaffee.dao;

import java.util.Collection;
import java.util.List;
import kaffee.entities.Entity;

/**
 * .
 * @author ahorvath
 * @param <T>
 */
public interface EntityDao<T extends Entity> {

	T getById(long id);

	List<T> getByIds(List<Long> ids);

	T persist(T e);

	void persistAll(Collection<T> all);

	void delete(T e);

	void deleteById(Long id);
}
