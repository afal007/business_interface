package ru.afal.bi.rest.configuration.dal;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import ru.afal.bi.core.bankws.BankWSClient;
import ru.afal.bi.core.bankws.BankWSClientImpl;
import ru.afal.bi.rest.business.gateway.repository.AccountRepository;
import ru.afal.bi.rest.business.gateway.repository.BankRepository;
import ru.afal.bi.rest.dal.dao.AccountDAO;
import ru.afal.bi.rest.dal.dao.BankDAO;
import ru.afal.bi.rest.dal.dao.BankWSDAO;
import ru.afal.bi.rest.dal.repository.AccountRepositoryDefault;
import ru.afal.bi.rest.dal.repository.BankRepositoryImpl;

@Configuration
public class DalDefaultConfiguration {

  @Bean
  public AccountRepository accountRepository(AccountDAO accountDao) {
    return new AccountRepositoryDefault(accountDao);
  }

  @Bean
  public Jaxb2Marshaller marshaller() {
    Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
    marshaller.setContextPath("ru.afal.bi.core.bankws.wsdl");
    return marshaller;
  }

  // TODO: Property
  @Bean
  BankWSClient bankWSClient(Jaxb2Marshaller marshaller) {
    BankWSClientImpl bankWSClient = new BankWSClientImpl("http://localhost:4000/bankWS/banks");
    bankWSClient.setMarshaller(marshaller);
    bankWSClient.setUnmarshaller(marshaller);
    return bankWSClient;
  }

  @Bean
  public BankDAO bankDAO(BankWSClient bankWSClient) {
    return new BankWSDAO(bankWSClient);
  }

  @Bean
  public BankRepository bankRepository(BankDAO bankDAO) {
    return new BankRepositoryImpl(bankDAO);
  }
}
