package ru.afal.bi.rest.web.controller.v1;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.afal.bi.rest.business.gateway.model.Bank;
import ru.afal.bi.rest.business.gateway.repository.BankRepository;
import ru.afal.bi.rest.web.api.BankDTO;

@RestController
@RequestMapping("/v1/bank")
@RequiredArgsConstructor
public class BankController {

  private final BankRepository bankRepository;

  @GetMapping("/bic/{bic}")
  public ResponseEntity<BankDTO> getAccountBalance(@PathVariable String bic) {
    return bankRepository.findByBic(bic)
      .map(this::getDto)
      .map(ResponseEntity::ok)
      .orElseGet(() -> ResponseEntity.notFound().build());
  }

  private BankDTO getDto(Bank bank) {
    return BankDTO.builder()
      .bic(bank.getBic())
      .name(bank.getName())
      .address(bank.getAddress())
      .swiftBic(bank.getSwiftBic())
      .build();
  }
}
