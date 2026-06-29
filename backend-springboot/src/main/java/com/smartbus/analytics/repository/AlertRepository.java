package com.smartbus.analytics.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.smartbus.analytics.entity.Alert;

@Repository
public interface AlertRepository extends JpaRepository<Alert, Long> {

}