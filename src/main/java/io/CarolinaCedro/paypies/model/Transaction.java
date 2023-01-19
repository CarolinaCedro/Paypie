package io.CarolinaCedro.paypies.model;

import io.CarolinaCedro.paypies.model.user.User;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@Table(name = "transactions")
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "sender_cpfOrCnpj", referencedColumnName = "cpfOrCnpj"),
            @JoinColumn(name = "sender_email", referencedColumnName = "email")
    })
    private User sender;

    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "receiver_cpfOrCnpj", referencedColumnName = "cpfOrCnpj"),
            @JoinColumn(name = "receiver_email", referencedColumnName = "email")
    })
    private User receiver;

    private BigDecimal amount;

    @Column(columnDefinition = "TIMESTAMP")
    private Timestamp transactionDate;
}
