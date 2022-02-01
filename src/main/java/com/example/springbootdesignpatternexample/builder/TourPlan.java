package com.example.springbootdesignpatternexample.builder;

import lombok.AllArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@AllArgsConstructor
public class TourPlan {

    private String title;

    private int days;

    private int nights;

    private LocalDate startDate;

    private String whereToStay;

    private List<DetailTourPlan> detailTourPlans;
}
