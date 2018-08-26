package com.vjp.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vjp.entity.Atm;
import com.vjp.repository.AtmRepository;

/**
 * @author VIJAY
 * This class makes the service implementations of ATM API
 */
@Transactional
@Service("atmService")
public class AtmServiceImpl implements AtmService {
  @Autowired
  private AtmRepository atmRepository; // ATM Repository class object init

  // Service implementation of getBalance() service
  @Override
  public Map<String,Object> getBalance(Integer pin) {
    Map<String,Object> balanceAmount = new HashMap<>();
    Optional<Atm> atm = Optional.ofNullable(atmRepository.findByPinNumber(pin));
    balanceAmount.put("Balance Amount",atm.get().getBalanceAmount());
    return balanceAmount;
  }

  // Service implementation of doTransaction() service
  @Override
  public Optional<Atm> doTransaction(Integer pin, String event, Double amount) {
    Optional<Atm> atm = Optional.ofNullable(atmRepository.findAllByPinNumber(pin));
    Double balance = atm.get().getBalanceAmount();
    if(event.equals("deposit")) {
      atm.get().setBalanceAmount(balance += amount);
    } else {
      atm.get().setBalanceAmount(balance -= amount);
    }
    return atm;
  }
}
