package org.example.sigfox.repository;

import org.example.sigfox.entity.Sigfox;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SigfoxRepository extends JpaRepository<Sigfox, Long>{
}
