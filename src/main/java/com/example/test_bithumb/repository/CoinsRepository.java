package com.example.test_bithumb.repository;

import com.example.test_bithumb.model.Coins;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoinsRepository extends CrudRepository<Coins, String> {
}
