package com.vjp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.vjp.entity.Atm;

/**
 * @author VIJAY P S
 * This is the repository class that talks with the atmdb database
 */
@Repository
public interface AtmRepository extends JpaRepository<Atm, Integer> {
  public Atm findByPinNumber(@Param("pin") Integer pin);
  public Atm findAllByPinNumber(@Param("pin") Integer pin);
}
