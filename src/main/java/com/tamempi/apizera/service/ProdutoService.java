package com.tamempi.apizera.service;
import com.tamempi.apizera.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.tamempi.apizera.model.Produto;


@Service
public class ProdutoService {
    @Autowired
    private ProdutoRepository produtoRepository;

    public List<Produto> buscarTodosProdutos(){
        return produtoRepository.findAll();
    }

    public Produto adicionarProduto(Produto produto){
        return produtoRepository.save(produto);
    }

    public Produto buscarProduto(Long id){
        return produtoRepository.findById(id).orElse(null);
    }

    public void removerProduto(Long id){
        produtoRepository.deleteById(id);
    }
}

