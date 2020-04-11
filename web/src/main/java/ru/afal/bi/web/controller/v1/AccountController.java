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

  @GetMapping("/{accountNumber}")
  public AccountBalance getAccountBalance(@PathVariable String accountNumber) {
    return accountBalanceService.getAccountBalance(accountNumber);
  }

  @PostMapping
  public ResponseEntity<Void> addAccount(@RequestBody AccountDTO account) {
    accountService.saveAccount(account);
    return ResponseEntity.ok(null);
  }
}
