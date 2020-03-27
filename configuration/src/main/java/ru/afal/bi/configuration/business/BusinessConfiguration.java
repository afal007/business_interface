package ru.afal.bi.configuration.business;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.afal.bi.business.gateway.repository.AccountRepository;
import ru.afal.bi.business.logic.service.AccountBalanceService;
import ru.afal.bi.business.logic.service.AccountBalanceServiceImpl;
import ru.afal.bi.business.logic.service.AccountService;
import ru.afal.bi.business.logic.service.AccountServiceImpl;

@Configuration
public class BusinessConfiguration {

  @Bean
  public AccountService accountService(AccountRepository accountRepository) {
    return new AccountServiceImpl(accountRepository);
  }

  @Bean
  public AccountBalanceService accountBalanceService(AccountRepository accountRepository) {
    return new AccountBalanceServiceImpl(accountRepository);
  }
}
