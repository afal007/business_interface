package ru.afal.bi.core.bankws;


import ru.afal.bi.core.bankws.wsdl.GetBankByBicResponse;

import java.util.Optional;

public interface BankWSClient {
  Optional<GetBankByBicResponse> getBankByBic(String bic);
}
