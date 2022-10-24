package com.collicode.billingmanager_group2.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "billing_TBL")
public class Billing {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  int  billingId;
    private  String billingName;
    private String  billingDescription;
    private String Category;
    private double billingAmount;
}
