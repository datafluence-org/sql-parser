package com.datafluence.sqlparser.dao;

import com.datafluence.sqlparser.models.Onboard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OnboardRepository extends JpaRepository<Onboard, String> {

}
