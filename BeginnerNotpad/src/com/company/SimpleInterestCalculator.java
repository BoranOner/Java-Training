package com.company;

import java.math.BigDecimal;

public class SimpleInterestCalculator {
    private  BigDecimal principal;
    private  BigDecimal interest;

    public SimpleInterestCalculator(String principal, String interest) {
        this.principal = new BigDecimal(principal);
        this.interest = new BigDecimal(interest);
    }

    // principal + principal * interest * noyears
    public BigDecimal calculateTotalValue(int years){
        BigDecimal totalAmount;
        totalAmount = principal.add(principal.multiply(interest).multiply(new BigDecimal(years)));
        return totalAmount;
    }
}
