package br.com.j4techsys.acordao.model.dao;

import java.io.Serializable;
import org.hibernate.criterion.DetachedCriteria;
import java.util.List;

public interface InterfaceDAO<T> {
	
	void save (T entity);
	void update (T entity);
	void remove (T entity);
	void merge (T entity);
	T getEntity(Serializable id);
	T getEntityByDetacacheCriteria(DetachedCriteria criteria);
	List<T> getListByDetacheCriteria(DetachedCriteria criteria);
	List<T> getEntities();
	
}
