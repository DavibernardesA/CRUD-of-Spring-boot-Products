package com.cubos.first.apirest.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Entity
public class Product {
  @Getter
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer id;

  @Getter
  @Setter
  @NotBlank(message = "There are mandatory fields not filed in.")
  @Column(nullable=false)
  private String name;

  @Getter
  @Setter
  @Min(value = 10, message = "The minimum value of the product is 10 cents")
  @Column(nullable = false)
  private Integer price;

  @Getter
  @Setter
  @Column()
  private String description;
}
