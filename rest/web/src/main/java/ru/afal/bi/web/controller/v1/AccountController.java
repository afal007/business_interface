package ru.afal.bi.web.controller.v1;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.afal.bi.business.logic.model.AccountBalance;
import ru.afal.bi.business.logic.service.AccountBalanceService;
import ru.afal.bi.business.logic.service.AccountService;
import ru.afal.bi.web.api.AccountDTO;

@RestController
@RequestMapping("/v1/account")
@RequiredArgsConstructor
public class AccountController {

  private final AccountService accountService;
  private final AccountBalanceService accountBalanceService;

  @GetMapping("/balance/{accountNumber}")
  public ResponseEntity<AccountBalance> getAccountBalance(@PathVariable String accountNumber) {
    return accountBalanceService.getAccountBalance(accountNumber)
      .map(ResponseEntity::ok)
      .orElseGet(() -> ResponseEntity.notFound().build());
  }

  @GetMapping("/balance/default")
  public ResponseEntity<AccountBalance> getDefaultBalance() {
    return ResponseEntity.ok(accountBalanceService.getAccountBalanceFromProperties());
  }

  @PostMapping
  public ResponseEntity<Void> addAccount(@RequestBody AccountDTO account) {
    accountService.saveAccount(account);
    return ResponseEntity.ok().build();
  }
}
