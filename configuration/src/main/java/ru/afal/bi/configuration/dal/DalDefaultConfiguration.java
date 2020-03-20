package ru.afal.bi.configuration.dal;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import ru.afal.bi.business.gateway.repository.AccountRepository;
import ru.afal.bi.dal.dao.AccountDao;
import ru.afal.bi.dal.repository.AccountRepositoryDefault;

@Configuration
@Profile("def")
public class DalDefaultConfiguration {

  @Bean
  public AccountRepository accountRepository(AccountDao accountDao) {
    return new AccountRepositoryDefault(accountDao);
  }
}
