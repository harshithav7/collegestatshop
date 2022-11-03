package com.geektrust.backend.dto;

public class GeneratedBillDto {
    private Integer totalDiscount;
    private Integer totalCost;

    public GeneratedBillDto(Integer totalDiscount, Integer totalCost) {
        this.totalDiscount= totalDiscount;
        this.totalCost = totalCost;
    }

    @Override
    public String toString() {
        return totalDiscount+" " + totalCost;
    }



}
