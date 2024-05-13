package api.produto.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import api.produto.api.entidades.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto,Long> {

}
