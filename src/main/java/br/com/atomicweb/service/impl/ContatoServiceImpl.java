package br.com.atomicweb.service.impl;

import java.util.List;

import br.com.atomicweb.model.Contato;
import br.com.atomicweb.repository.ContatoRepository;
import br.com.atomicweb.service.ContatoService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ContatoServiceImpl implements ContatoService {

	private final ContatoRepository contatoRepository;

	@Override
	public List<Contato> listaContatos() {
		return contatoRepository.listaContato();
	}

	@Override
	public Contato getContato(Contato contato) {
		return contatoRepository.getContato(contato);
	}

	@Override
	public void salvaContato(Contato contato) {
		contatoRepository.salvaContato(contato);
	}

	@Override
	public void editaContato(Contato contato) {
		contatoRepository.editaContato(contato);
	}

	@Override
	public void deletaContato(Contato contato) {
		contatoRepository.deletaContato(contato);
	}
}
