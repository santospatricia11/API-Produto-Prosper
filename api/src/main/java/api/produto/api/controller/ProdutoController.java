package api.produto.api.controller;

import java.util.List;

import org.apache.el.stream.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import api.produto.api.entidades.Produto;
import api.produto.api.service.ProdutoService;

@RestController
@RequestMapping("/api/produto")
public class ProdutoController {
	@Autowired
	private ProdutoService produtoService;

	@GetMapping
	public List<Produto> listarTodos() {
		return produtoService.listarTodos();
	}

	/*
	 * @GetMapping("/{id}") public ResponseEntity<Produto> obterPorId(@PathVariable
	 * Long id) { Optional<Produto> produto = produtoService.obterPorId(id); return
	 * produto.map(ResponseEntity::ok).orElseGet(() ->
	 * ResponseEntity.notFound().build()); }
	 */

	@PostMapping
	public Produto salvar(@RequestBody Produto produto) {
		return produtoService.salvar(produto);
	}

	@PutMapping("/{id}")
	public ResponseEntity<Produto> atualizar(@PathVariable Long id, @RequestBody Produto produto) {
		if (!produtoService.obterPorId(id).isPresent()) {
			return ResponseEntity.notFound().build();
		}
		produto.setId(id);
		Produto produtoAtualizado = produtoService.salvar(produto);
		return ResponseEntity.ok(produtoAtualizado);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deletar(@PathVariable Long id) {
		if (!produtoService.obterPorId(id).isPresent()) {
			return ResponseEntity.notFound().build();
		}
		produtoService.deletar(id);
		return ResponseEntity.noContent().build();
	}

}
