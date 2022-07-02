package br.com.atomicweb.action;

import java.util.ArrayList;
import java.util.List;

import br.com.atomicweb.model.Contato;
import com.opensymphony.xwork2.ActionSupport;
import lombok.Data;

@Data
public class ContatoAction extends ActionSupport {

	private static final long serialVersionUID = -8205834090635913361L;

	private Integer id;
	private String nome;
	private String email;
	private Contato contato;
	private List<Contato> contatos;

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		contatos = new ArrayList<>();
		contato = new Contato();
		contato.setId(1);
		contato.setNome("Claudemir");
		contato.setEmail("claudemir@bsd.com.br");
		contatos.add(contato);
		contato = new Contato();
		contato.setId(2);
		contato.setNome("Karine");
		contato.setEmail("karine@gmail.com.br");
		contatos.add(contato);
		contato = new Contato();
		contato.setId(this.id);
		contato.setNome(this.nome);
		contato.setEmail(this.email);
		contatos.add(contato);
		return SUCCESS;
	}

	public String novo() {
		return SUCCESS;
	}
	
	public String editar() {
		System.out.println("Editando... " + this.id);
		return SUCCESS;
	}

	public String excluir() {
		System.out.println("Excluindo... " + this.id);
		return SUCCESS;
	}

}
