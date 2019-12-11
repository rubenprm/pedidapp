package com.rprm.pedidapp.dao;

import java.io.Serializable;

public class PedidosappDAOImpl<T, PK extends Serializable> implements IPedidosappDAO<T, PK> {
	
	//@Autowired(required=true)
    //@Qualifier("sessionPedidosapp")
    /*private Session session;
	
    private Class<T> type;
    
	public PedidosappDAOImpl(Session session, Class<T> type) {
		super();
		this.session = session;
		this.type = type;
	}
	
	public PedidosappDAOImpl() {
		super();
	}

	public Session getSession() {
		return session;
	}

	public void setSession(Session session) {
		this.session = session;
	}

	@SuppressWarnings("unchecked")
	@Override
	public PK create(T newInstance) {
		return (PK) getSession().save(newInstance);
	}

    @Override
    public T get(PK id) {
        return (T) getSession().get(type, id);
    }

    @Override
    public void delete (T elemt){
    	getSession().delete(elemt);
    }
    @Override
    public void update(T entity) {
        getSession().update(entity);
    }*/
}
