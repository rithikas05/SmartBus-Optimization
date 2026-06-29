package com.smartbus.analytics.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.smartbus.analytics.entity.Recommendation;

@Repository
public interface RecommendationRepository extends JpaRepository<Recommendation, Long> {

}