package com.eclass.eclassbrand.DAO;

import com.eclass.eclassbrand.POJO.Apply;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigInteger;
import java.util.List;

public interface ApplyDAO extends JpaRepository<Apply, BigInteger> {

    List<Apply> findByScheduleAndState(String schedule, String state);
}
