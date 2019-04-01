package com.accelerate.kafka.demo.repo;

import com.accelerate.kafka.demo.model.RequestStat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RequestStatRepo extends JpaRepository<RequestStat,Long>{

}