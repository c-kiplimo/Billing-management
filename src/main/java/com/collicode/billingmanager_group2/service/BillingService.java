package com.collicode.billingmanager_group2.service;

import com.collicode.billingmanager_group2.entity.Billing;
import com.collicode.billingmanager_group2.repository.BillingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class BillingService {
    @Autowired
   private BillingRepository billingRepository;


    public Billing savebills(Billing billing){
        return billingRepository.save(billing);
    }
    public List<Billing> getAllBills(){
        return billingRepository.findAll();
    }
    public Billing getBillById(int id){
        return billingRepository.findById(id).orElse(null);
    }
    public String deleteBills(int id){
        billingRepository.deleteById(id);
        return " Bill removed "+ id;
    }
    public Billing updateBills(Billing billing){
        Billing existingBills=billingRepository.findById(billing.getBillingId()).orElse(null);
        existingBills.setBillingName(billing.getBillingName());
        existingBills.setBillingAmount(billing.getBillingAmount());
        existingBills.setBillingDescription(billing.getBillingDescription());
        existingBills.setBillingDescription(billing.getBillingDescription());
        return billingRepository.save(existingBills);
    }

}
