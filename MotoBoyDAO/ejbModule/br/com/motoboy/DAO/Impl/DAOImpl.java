package br.com.motoboy.DAO.Impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.motoboy.DAO.DAO;

abstract class DAOImpl<T> implements DAO<T> {

	@PersistenceContext
	EntityManager manager;

	@Override
	public void salvar(T model) {
		manager.persist(model);
	}

	@Override
	public void atualizar(T model) {
		manager.merge(model);

	}

	@Override
	public void remover(T model) {
		manager.remove(model);

	}

}
