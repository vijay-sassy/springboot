package com.vjp.service;

import java.util.Map;
import java.util.Optional;

import com.vjp.entity.Atm;

/**
 * @author VIJAY P S
 * Have abstract methods for services
 */
public interface AtmService {
  // Service that gets bank balance
  public Map<String,Object> getBalance(Integer pin);
  
  // Service that does transaction and gets information
  public Optional<Atm> doTransaction(Integer pin, String event, Double amount);
}
