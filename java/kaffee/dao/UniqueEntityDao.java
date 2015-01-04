package kaffee.dao;

import java.util.List;
import kaffee.entities.UniqueEntity;

/**
 * .
 * @author ahorvath
 * @param <T> .
 */
public interface UniqueEntityDao<T extends UniqueEntity> extends EntityDao<T> {

	T getBySid(String sid);

	List<T> getBySids(List<String> sids);
}
