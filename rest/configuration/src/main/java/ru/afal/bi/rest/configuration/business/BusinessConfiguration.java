package ru.afal.bi.rest.configuration.business;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.afal.bi.rest.business.gateway.repository.AccountRepository;
import ru.afal.bi.rest.business.logic.properties.AccountBalanceProperties;
import ru.afal.bi.rest.business.logic.service.AccountBalanceService;
import ru.afal.bi.rest.business.logic.service.AccountBalanceServiceImpl;
import ru.afal.bi.rest.business.logic.service.AccountService;
import ru.afal.bi.rest.business.logic.service.AccountServiceImpl;

@Configuration
public class BusinessConfiguration {

  @Bean
  public AccountService accountService(AccountRepository accountRepository) {
    return new AccountServiceImpl(accountRepository);
  }

  @Bean
  public AccountBalanceService accountBalanceService(AccountRepository accountRepository, AccountBalanceProperties accountBalanceProperties) {
    return new AccountBalanceServiceImpl(accountRepository, accountBalanceProperties);
  }
}
