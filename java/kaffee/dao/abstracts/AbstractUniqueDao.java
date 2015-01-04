package kaffee.dao.abstracts;

import kaffee.dao.UniqueEntityDao;
import kaffee.entities.UniqueEntity;

public abstract class AbstractUniqueDao<T extends UniqueEntity> extends AbstractEntityDao<T> implements UniqueEntityDao<T> {

}
