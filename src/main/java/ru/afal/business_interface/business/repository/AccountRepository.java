package ru.afal.business_interface.business.repository;

import org.springframework.stereotype.Repository;
import ru.afal.business_interface.business.model.Account;

import java.util.Optional;

@Repository
public interface AccountRepository {
  Optional<? extends Account> getByNumber(String accountNumber);
}
