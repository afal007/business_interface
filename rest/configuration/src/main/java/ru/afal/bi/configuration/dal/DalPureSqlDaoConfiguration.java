package ru.afal.bi.configuration.dal;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.core.JdbcTemplate;
import ru.afal.bi.dal.dao.AccountDao;
import ru.afal.bi.dal.dao.AccountJdbcDao;

@Configuration
@Profile("pureSql")
public class DalPureSqlDaoConfiguration {
  @Bean
  public AccountDao accountDao(JdbcTemplate jdbcTemplate) {
    return new AccountJdbcDao(jdbcTemplate);
  }
}
