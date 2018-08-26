package com.vjp.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

/**
 * @author VIJAY P S
 * This is the entity class which maps exactly with the schema table
 */
@Entity
@Table(name="atm",schema="atmdb")
@EntityListeners(AuditingEntityListener.class)
public class Atm implements Serializable {
  private static final long serialVersionUID = 1L;
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id; // Entity Id which is auto-incremented & primary key
  
  @NotNull // Validates for null value
  @Column(nullable = false)
  private String name; // Account Holder's name

  @NotNull // Validates for null value
  @Column(nullable = false)
  @JsonProperty(access = Access.WRITE_ONLY)
  private Integer pinNumber; // PIN Number of card

  @NotNull // Validates for null value
  @Column(nullable = false)
  private Double balanceAmount; // Account balance amount

  // Getters & Setters go here
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getPinNumber() {
    return pinNumber;
  }

  public void setPinNumber(Integer pinNumber) {
    this.pinNumber = pinNumber;
  }

  public Double getBalanceAmount() {
    return balanceAmount;
  }

  public void setBalanceAmount(Double balanceAmount) {
    this.balanceAmount = balanceAmount;
  }
  
  
}
