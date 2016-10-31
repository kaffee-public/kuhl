package kaffee.dao.fakes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import kaffee.dao.abstracts.AbstractEntityDao;
import kaffee.entities.Entity;

/**
 * Use this class for testing purposes only (ie. Unit-tests).
 *
 * @author ahorvath
 * @param <T>
 */
public class FakeEntityDao<T extends Entity<? extends Number>> extends AbstractEntityDao<T> {

	private static int counter = 0;
	private final Map<Number, T> data = new TreeMap<>();

	@Override
	public T selectById(Number id) {
		return data.get(id);
	}

	@Override
	public List<T> selectByIds(List<? extends Number> ids) {
		List<T> ret = new ArrayList<>(ids.size());
		for (Number id : ids) {
			ret.add(data.get(id));
		}
		return ret;
	}

	@Override
	public T persist(T e) {
		if (e.getId() == null) {
			e.setId(new Integer(++counter));
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
	public void deleteById(Number id) {
		data.remove(id);
	}
}
