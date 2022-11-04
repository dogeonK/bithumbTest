package com.example.test_bithumb.repository;

import com.example.test_bithumb.model.Prices;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PricesRepository extends CrudRepository<Prices, Integer> {

    //최신 10개 가격 정보 조회
    List<Prices> findFirst10ByCoincodeOrderByDateDesc(String Coincode);

    //코인별 데이터 수 조회
    Long countByCoincode(String Coincode);
}
