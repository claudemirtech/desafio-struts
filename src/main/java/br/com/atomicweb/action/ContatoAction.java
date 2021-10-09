package br.com.atomicweb.action;


import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import br.com.atomicweb.model.Contato;

public class ContatoAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8205834090635913361L;
	private Contato c;
	private List<Contato> lista;
	private Long id;
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		lista = new ArrayList<>();
		c = new Contato();
		c.setId(Long.parseLong("1"));
		c.setNome("Claudemir");
		c.setEmail("claudemir@bsd.com.br");
		lista.add(c);
		c = new Contato();
		c.setId(Long.parseLong("2"));
		c.setNome("Karine");
		c.setEmail("karine@gmail.com.br");
		lista.add(c);
		return SUCCESS;
	}

	public String novo() {
		c = new Contato();
		return SUCCESS;
	}
	
	public String editar() {
		c = new Contato();
		System.out.println(this.id);
		return SUCCESS;
	}

	public List<Contato> getLista() {
		return lista;
	}

	public void setLista(List<Contato> lista) {
		this.lista = lista;
	}

	public Contato getC() {
		return c;
	}

	public void setC(Contato c) {
		this.c = c;
	}

}
