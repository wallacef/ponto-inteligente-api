package com.api.pontointeligente.services;

import java.util.Optional;

import com.api.pontointeligente.entities.Lancamento;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

public interface LancamentoService {
    
    /**
     * Retorna uma lista paginada de lançamentos de um determinado funcionário
     * 
     * @param funcionarioId
     * @param pageRequest
     * @return Page<Lancamento>
     */
    Page<Lancamento> buscarPorFuncionarioId(Long funcionarioId, PageRequest pageRequest);

    /**
     * Retorna um lançamento por ID.
     * 
     * @param id
     * @return Optional<Lancamento>
     */
    Optional<Lancamento> buscarPorId(Long id);

    /**
     * Persiste um lancamento na base de dados
     * 
     * @param lancamento
     * @return Lancamento
     */
    Lancamento persistir(Lancamento lancamento);

    /**
     * Remove um lançamento da base de dados.
     * 
     * @param id
     */
    void remover(Long id);
}
