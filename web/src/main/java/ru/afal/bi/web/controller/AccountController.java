package ru.afal.bi.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.afal.bi.business.logic.model.AccountBalance;
import ru.afal.bi.business.logic.service.AccountBalanceService;

@Profile({"def", "post"})
@RestController
@RequestMapping("/account")
@RequiredArgsConstructor
public class AccountController {

  private final AccountBalanceService accountBalanceService;

  @GetMapping("/{accountNumber}")
  public AccountBalance getAccountBalance(@PathVariable String accountNumber) {
    return accountBalanceService.getAccountBalance(accountNumber);
  }
}
