package com.br.zupacademy.transacao.cartaotransacoes;

import org.springframework.http.ResponseEntity;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TransacaoController {

	private Transacao transacao;
	
	@KafkaListener(topics = "transacoes", groupId = "minha-aplicacao")
	public void listen(Transacao transacao) {
		this.transacao = transacao;
		
		System.out.println(transacao);
	}
	
	@PostMapping("/cartoes/{id}/transacoes")
	public ResponseEntity<?> findAll() {
		return ResponseEntity.ok(transacao);
	}
}
