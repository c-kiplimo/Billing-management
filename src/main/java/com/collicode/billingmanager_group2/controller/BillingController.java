package com.collicode.billingmanager_group2.controller;

import com.collicode.billingmanager_group2.entity.Billing;
import com.collicode.billingmanager_group2.repository.BillingRepository;
import com.collicode.billingmanager_group2.service.BillingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


public class BillingController {
    @Autowired
    private BillingService billingService;

    @Autowired
    private BillingRepository billingRepository;
    @PostMapping("/addBills")
    public Billing addBills(@RequestBody Billing billing){
        return billingService.savebills(billing);
    }
    @GetMapping("/Bills")
    public List<Billing> findBills(){
        return billingService.getAllBills();
    }
    @GetMapping("/BillsById/{id}")
    public Billing findBillsById(@PathVariable int id){
        return billingService.getBillById(id);
    }
    @DeleteMapping("/deleteBill/{id}")
    public String deleteBill(@PathVariable int id){
        return billingService.deleteBills(id);
    }
    @PutMapping("/updateBill/{id}")
    public Billing updateBill(@RequestBody Billing billing){

        return billingService.updateBills(billing);
    }
}

