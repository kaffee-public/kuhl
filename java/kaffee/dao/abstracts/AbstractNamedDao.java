package kaffee.dao.abstracts;

import kaffee.dao.NamedEntityDao;
import kaffee.entities.NamedEntity;

/**
 *
 * @author Adam
 */
public abstract class AbstractNamedDao<T extends NamedEntity> extends AbstractUniqueDao<T> implements NamedEntityDao<T> {

}
