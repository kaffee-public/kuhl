package kaffee.dao.abstracts;

import kaffee.dao.NamedEntityDao;
import kaffee.entities.NamedEntity;

/**
 *
 * @author ahorvath
 */
public abstract class AbstractNamedDao<T extends NamedEntity<? extends Number>> extends AbstractUniqueDao<T> implements NamedEntityDao<T> {

}
