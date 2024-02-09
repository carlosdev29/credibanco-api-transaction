package com.credibanco.transaction.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.credibanco.transaction.client.dto.CardBalanceRequestDTO;
import com.credibanco.transaction.client.dto.CardBalanceResponseDTO;
import com.credibanco.transaction.client.dto.CardNumberResponseDTO;

@FeignClient(name="cards-api" , url = "http://localhost:8080/cards")
@RequestMapping("/cards")
public interface ICardClient {
	
	@GetMapping(value = "/{productId}/number")
	public CardNumberResponseDTO getCardNumber(@PathVariable String productId); 

	@PostMapping(value = "/balance")
	public CardBalanceResponseDTO updateBalance(@RequestBody CardBalanceRequestDTO cardBalanceRequestDTO);
	
	

}
