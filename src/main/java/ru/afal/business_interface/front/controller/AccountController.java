package ru.afal.business_interface.front.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.afal.business_interface.business.service.AccountBalanceService;
import ru.afal.business_interface.front.api.AccountBalance;

@RestController
@RequestMapping("/account")
@RequiredArgsConstructor
public class AccountController {

  private final AccountBalanceService accountBalanceService;

  @GetMapping(value = "/{accountNumber}")
  public AccountBalance getAccountBalance(@PathVariable String accountNumber) {
    return accountBalanceService.getAccountBalance(accountNumber);
  }
}
