package HQL;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.transaction.annotation.Transactional;

import com.ncr.todo.Helper.CommonUtils;
import com.ncr.todo.model.ToDoList;
@Transactional
public class HibernateQuerries {
 
private EntityManager em;
public HibernateQuerries(EntityManager em) {
	super();
	this.em = em;
	}
public Iterable<ToDoList> getData(Long id)
{
	List result=em.createQuery("from ToDoList where id=:qlid").setParameter("qlid",1L).getResultList();
	return result;
}


}
