package kaffee.dao.fakes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import kaffee.dao.abstracts.AbstractEntityDao;
import kaffee.entities.Entity;

/**
 *
 * @author ahorvath
 * @param <T>
 */
public class FakeEntityDao<T extends Entity> extends AbstractEntityDao<T> {

	private static long counter = 0;
	private final Map<Long, T> data = new TreeMap<Long, T>();

	@Override
	public T getById(long id) {
		return data.get(id);
	}

	@Override
	public List<T> getByIds(List<Long> ids) {
		List<T> ret = new ArrayList<>(ids.size());
		for (Long id : ids) {
			ret.add(data.get(id));
		}
		return ret;
	}

	@Override
	public T persist(T e) {
		if (e.getId() == null) {
			e.setId(++counter);
		}
		return data.put(counter, e);
	}

	@Override
	public void persistAll(Collection<T> all) {
		for (T e : all) {
			persist(e);
		}
	}

	@Override
	public void delete(T e) {
		data.remove(e.getId());
	}

	@Override
	public void deleteById(Long id) {
		data.remove(id);
	}
}
