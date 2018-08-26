package com.vjp.base.apicontroller;

import java.util.Map;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.vjp.entity.Atm;
import com.vjp.service.AtmService;

/**
 * 
 * @author VIJAY P S
 * This is the controller class which controls the HTTP requests to the ATM API
 */
@RestController
@RequestMapping("/atmapi")
public class AtmController {
  @Autowired
  AtmService atmService; // ATM Service class object initialization
  
  /**
   * @param pin - ATM Pin number
   * @return Bank Balance
   */
  @GetMapping("/balance/{pin}")
  public Map<String,Object> showBalance(@PathVariable(value = "pin") Integer pin) {
    return atmService.getBalance(pin);   
  }
  
  /**
   * @param pin - ATM Pin number
   * @param event - Deposit/Withdraw event
   * @param amount - Amount to deposit/withdraw
   * @return Account Information / ATM member variables except PIN number
   */
  @GetMapping("/transact/{pin}/{event}/{amount}")
  public Atm getAccountInfo(@PathVariable(value="pin") Integer pin,
                            @PathVariable(value="event") String event,
                            @PathVariable(value="amount") Double amount) {
    Optional<Atm> atm = atmService.doTransaction(pin, event, amount);
    return atm.get();
  }
}
