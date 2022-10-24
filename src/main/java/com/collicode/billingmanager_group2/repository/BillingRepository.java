package com.collicode.billingmanager_group2.repository;

import com.collicode.billingmanager_group2.entity.Billing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BillingRepository extends JpaRepository<Billing,Integer> {
}
