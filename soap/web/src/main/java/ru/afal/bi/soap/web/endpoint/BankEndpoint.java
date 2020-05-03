package ru.afal.bi.soap.web.endpoint;

import bankws_schema.GetBankByBicRequest;
import bankws_schema.GetBankByBicResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import ru.afal.bi.common.core.objects.EmptyObjects;
import ru.afal.bi.soap.business.repository.BankRepository;
import ru.afal.bi.soap.web.mapper.BankSoapMapper;

@Endpoint
@RequiredArgsConstructor
public class BankEndpoint {

  private final BankRepository bankRepository;
  private final BankSoapMapper bankSoapMapper;

  @PayloadRoot(localPart = "GetBankByBicRequest", namespace = "bankws-schema")
  @ResponsePayload
  public GetBankByBicResponse getBankByBic(@RequestPayload GetBankByBicRequest getBankByBicRequest) {
    return bankRepository.findByBic(getBankByBicRequest.getBic())
      .map(bankSoapMapper::map)
      .orElseGet(() -> EmptyObjects.get(GetBankByBicResponse.class));
  }
}
