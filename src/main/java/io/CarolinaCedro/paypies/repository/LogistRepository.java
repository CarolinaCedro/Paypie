package io.CarolinaCedro.paypies.repository;

import io.CarolinaCedro.paypies.model.logist.Logist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LogistRepository extends JpaRepository<Logist, String> {
}