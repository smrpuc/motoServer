package br.com.motoboy.DAO;

public interface DAO<T> {
	public void salvar(T model);

	public void atualizar(T model);

	public void remover(T model);

}
