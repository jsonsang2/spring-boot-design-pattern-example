package com.example.springbootdesignpatternexample.builder;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DefaultTourPlanBuilder implements TourPlanBuilder {

    private String title;

    private int days;

    private int nights;

    private LocalDate startDate;

    private String whereToStay;

    private List<DetailTourPlan> detailTourPlans;

    @Override
    public TourPlanBuilder nightsAndDays(int nights, int days) {
        this.nights = nights;
        this.days = days;
        return this;
    }

    @Override
    public TourPlanBuilder title(String title) {
        this.title = title;
        return this;
    }

    @Override
    public TourPlanBuilder startDate(LocalDate localDate) {
        this.startDate = localDate;
        return this;
    }

    @Override
    public TourPlanBuilder whereToStay(String whereToStay) {
        this.whereToStay = whereToStay;
        return this;
    }

    @Override
    public TourPlanBuilder addPlan(int day, String plan) {
        if (detailTourPlans == null) {
            detailTourPlans = new ArrayList<>();
        }
        this.detailTourPlans.add(new DetailTourPlan(day, plan));
        return this;
    }

    @Override
    public TourPlan getPlan() {
        return new TourPlan(title, days, nights, startDate, whereToStay, detailTourPlans);
    }
}
