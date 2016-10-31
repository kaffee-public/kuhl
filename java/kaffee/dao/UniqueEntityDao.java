package kaffee.dao;

import java.util.List;
import kaffee.entities.UniqueEntity;

/**
 * .
 * @author ahorvath
 * @param <T> .
 */
public interface UniqueEntityDao<T extends UniqueEntity<? extends Number>> extends EntityDao<T> {

	T selectBySid(String sid);

	List<T> selectBySids(List<String> sids);
}
