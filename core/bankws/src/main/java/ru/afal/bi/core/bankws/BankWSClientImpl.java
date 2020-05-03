package ru.afal.bi.core.bankws;

import lombok.RequiredArgsConstructor;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;
import ru.afal.bi.core.bankws.wsdl.GetBankByBicRequest;
import ru.afal.bi.core.bankws.wsdl.GetBankByBicResponse;

import java.util.Optional;

@RequiredArgsConstructor
public class BankWSClientImpl extends WebServiceGatewaySupport implements BankWSClient {

  private final String url;

  @Override
  public Optional<GetBankByBicResponse> getBankByBic(String bic) {
    GetBankByBicRequest request = new GetBankByBicRequest();
    request.setBic(bic);

    GetBankByBicResponse res = (GetBankByBicResponse) getWebServiceTemplate()
      .marshalSendAndReceive(url, request, new SoapActionCallback("soapAction"));

    return Optional.ofNullable(res);
  }
}
