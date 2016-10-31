package kaffee.dao.abstracts;

import kaffee.dao.EntityDao;
import kaffee.entities.Entity;

public abstract class AbstractEntityDao<T extends Entity<? extends Number>> implements EntityDao<T> {

}
