package io.CarolinaCedro.paypies.model.user;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserId implements Serializable {

    @Column(unique = true)
    private String cpfOrCnpj;

    @Column(unique = true)
    private String email;
}


