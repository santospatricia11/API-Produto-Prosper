package api.produto.api.entidades;

import javax.swing.Spring;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Produto {
	 @Id
	private long id;
	 
	private String nome;
	
	private  long preco;
	
	private String descricao;

	
	
	
	public Produto(long id, String nome, long preco, String descricao) {
		
		this.id = id;
		this.nome = nome;
		this.preco = preco;
		this.descricao = descricao;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public long getPreco() {
		return preco;
	}

	public void setPreco(long preco) {
		this.preco = preco;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	
}
