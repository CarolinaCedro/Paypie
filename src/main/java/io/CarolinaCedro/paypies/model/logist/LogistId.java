package io.CarolinaCedro.paypies.model.logist;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LogistId implements Serializable {

    @Column(unique = true)
    private String cpfOrCnpj;

    @Column(unique = true)
    private String email;
}


