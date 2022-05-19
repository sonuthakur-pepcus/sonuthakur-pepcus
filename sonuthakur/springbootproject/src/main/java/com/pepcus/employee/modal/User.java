package com.pepcus.employee.modal;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "User")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class User {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer userId;

  private String userName;

  private Date registrationDate;

  private Date deactivationDate;

  @OneToMany(cascade = CascadeType.ALL)
  @JoinColumn(name = "uId")
  private List<Book> bookIssuedList = new ArrayList<>();
}
