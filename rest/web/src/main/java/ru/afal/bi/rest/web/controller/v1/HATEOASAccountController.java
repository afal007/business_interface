package ru.afal.bi.rest.web.controller.v1;

import lombok.RequiredArgsConstructor;
import org.springframework.hateoas.EntityModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.afal.bi.rest.business.logic.model.AccountBalance;
import ru.afal.bi.rest.business.logic.service.AccountBalanceService;
import ru.afal.bi.rest.business.logic.service.AccountService;
import ru.afal.bi.rest.web.api.AccountDTO;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
@RequestMapping("/hateoas/v1/account")
@RequiredArgsConstructor
public class HATEOASAccountController {

  private final AccountService accountService;
  private final AccountBalanceService accountBalanceService;

  @GetMapping("/balance/{accountNumber}")
  public ResponseEntity<EntityModel<AccountBalance>> getAccountBalance(@PathVariable String accountNumber) {
    return ResponseEntity.of(
      accountBalanceService.getAccountBalance(accountNumber)
        .map(b -> new EntityModel<>(
            b,
            linkTo(methodOn(HATEOASAccountController.class).getAccountBalance(accountNumber)).withSelfRel(),
            linkTo(methodOn(HATEOASAccountController.class).getDefaultBalance()).withRel("default")
          )
        )
    );
  }

  @GetMapping("/balance/default")
  public ResponseEntity<EntityModel<AccountBalance>> getDefaultBalance() {
    return ResponseEntity.ok(
      new EntityModel<>(
        accountBalanceService.getAccountBalanceFromProperties(),
        linkTo(methodOn(HATEOASAccountController.class).getDefaultBalance()).withSelfRel()
      )
    );
  }

  @PostMapping
  @ResponseStatus(HttpStatus.OK)
  public void addAccount(@RequestBody AccountDTO account) {
    // TODO
    accountService.saveAccount(account);
  }
}
