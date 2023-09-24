package com.tamempi.apizera.repository;


import com.tamempi.apizera.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
