package br.com.motoboy.beans;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import br.com.motoboy.DAO.UsuarioDAO;
import br.com.motoboy.Model.UsuarioModel;

@Stateless
public class UsuarioBean {
	@EJB
	UsuarioDAO dao;

	public void salvarUsuario(UsuarioModel model) {
		dao.salvar(model);
	}

}
