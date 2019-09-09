package com.avp256.avp256_bot.model;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name="users")
public class Person {
    @Id
    Integer id;
    String name;
    String authCode;
}
