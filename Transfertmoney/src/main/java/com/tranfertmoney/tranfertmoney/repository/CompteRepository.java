package com.tranfertmoney.tranfertmoney.repository;

import com.tranfertmoney.tranfertmoney.model.Compte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CompteRepository extends JpaRepository<Compte, Integer> {
    
}