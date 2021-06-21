package com.br.zupacademy.transacao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.zupacademy.transacao.entities.Cartao;

public interface CartaoRepository extends JpaRepository<Cartao, String> {

}
