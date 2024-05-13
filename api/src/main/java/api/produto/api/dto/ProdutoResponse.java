package api.produto.api.dto;

import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class ProdutoResponse {
	private long id;
	
	private String nome;

	private long preco;

	private String descricao;

}
