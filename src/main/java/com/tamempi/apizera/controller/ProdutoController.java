package com.tamempi.apizera.controller;

import com.tamempi.apizera.model.Produto;
import com.tamempi.apizera.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class    ProdutoController {
    @Autowired
    private ProdutoService produtoService;

    @GetMapping
    public List<Produto> buscarTodos(){
        return produtoService.buscarTodosProdutos();
    }

    @PostMapping
    public Produto adicionarProduto(@RequestBody Produto produto){
        return produtoService.adicionarProduto(produto);
    }

    @DeleteMapping ("/{id}")
    public void removerProduto(@PathVariable Long id) throws Exception{
        produtoService.removerProduto(id);
    }
}
