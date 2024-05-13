package api.produto.api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import api.produto.api.entidades.Produto;
import api.produto.api.repository.ProdutoRepository;

@Service
public class ProdutoService {

	@Autowired
	private ProdutoRepository produtoRepository;

	public List<Produto> listarTodos() {
		return produtoRepository.findAll();
	}

	public Optional<Produto> obterPorId(Long id) {
		return produtoRepository.findById(id);
	}

	public Produto salvar(Produto produto) {
		return produtoRepository.save(produto);
	}

	public void deletar(Long id) {
		produtoRepository.deleteById(id);
	}
}
