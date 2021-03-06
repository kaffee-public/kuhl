package kaffee.dao.fakes;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import kaffee.dao.UniqueEntityDao;
import kaffee.entities.UniqueEntity;

/**
 * .
 * @author ahorvath
 * @param <T>
 */
public class FakeUniqueDao<T extends UniqueEntity<? extends Number>> extends FakeEntityDao<T> implements UniqueEntityDao<T> {

	private final Map<String, T> dataBySid = new TreeMap<>();

	@Override
	public T selectBySid(String sid) {
		return dataBySid.get(sid);
	}

	@Override
	public List<T> selectBySids(List<String> sids) {
		List<T> ret = new ArrayList<>();
		for (String sid : sids) {
			ret.add(dataBySid.get(sid));
		}
		return ret;
	}

	@Override
	public T persist(T e) {
		super.persist(e);
		return dataBySid.put(e.getSid(), e);
	}
}
