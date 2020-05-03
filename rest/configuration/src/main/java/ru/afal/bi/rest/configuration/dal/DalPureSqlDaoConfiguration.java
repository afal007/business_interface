package ru.afal.bi.rest.configuration.dal;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.core.JdbcTemplate;
import ru.afal.bi.rest.dal.dao.AccountDAO;
import ru.afal.bi.rest.dal.dao.AccountJdbcDAO;

@Configuration
@Profile("pureSql")
public class DalPureSqlDaoConfiguration {
  @Bean
  public AccountDAO accountDao(JdbcTemplate jdbcTemplate) {
    return new AccountJdbcDAO(jdbcTemplate);
  }
}
