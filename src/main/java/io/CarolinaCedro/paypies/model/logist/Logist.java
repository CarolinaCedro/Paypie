package io.CarolinaCedro.paypies.model.logist;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@Table(name = "logists")
@Data
@AllArgsConstructor
@NoArgsConstructor
@IdClass(LogistId.class)
public class Logist {

    @Id
    private String cpfOrCnpj;

    @Id
    private String email;
    private String password;
    private BigDecimal amount;

    @Column(columnDefinition = "TIMESTAMP")
    private Timestamp creationDate;

}

