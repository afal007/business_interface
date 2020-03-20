package ru.afal.bi.configuration.business;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import ru.afal.bi.business.gateway.repository.AccountRepository;
import ru.afal.bi.business.logic.service.AccountBalanceService;
import ru.afal.bi.business.logic.service.AccountBalanceServiceImpl;

@Configuration
@Profile({"def", "post"})
public class BusinessConfiguration {

  @Bean
  public AccountBalanceService accountBalanceService(AccountRepository accountRepository) {
    return new AccountBalanceServiceImpl(accountRepository);
  }
}
