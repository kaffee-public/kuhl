package kaffee.dao;

import kaffee.entities.NamedEntity;

/**
 *
 * @author ahorvath
 * @param <T>
 */
public interface NamedEntityDao<T extends NamedEntity<? extends Number>> extends UniqueEntityDao<T> {

}
