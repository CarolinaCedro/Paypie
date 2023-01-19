package io.CarolinaCedro.paypies.model.user;

import io.CarolinaCedro.paypies.model.logist.LogistId;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@Table(name = "users")
@Data
@AllArgsConstructor
@NoArgsConstructor
@IdClass(UserId.class)
public class User {

    @Id
    private String cpfOrCnpj;

    @Id
    private String email;

    private String password;
    private BigDecimal amount;

    @Column(columnDefinition = "TIMESTAMP")
    private Timestamp creationDate;

}

