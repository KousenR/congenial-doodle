package com.mindex.challenge.dao;

import com.mindex.challenge.data.Compensation;
import org.springframework.stereotype.Repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface CompensationRepository extends MongoRepository<Compensation, String> {
    Compensation findByEmployeeEmployeeId(String employeeId);
}