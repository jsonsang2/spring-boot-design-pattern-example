package com.example.springbootdesignpatternexample.builder;

import java.time.LocalDate;

public class TourDirector {

    private TourPlanBuilder tourPlanBuilder;

    public TourDirector(TourPlanBuilder tourPlanBuilder) {
        this.tourPlanBuilder = tourPlanBuilder;
    }

    public TourPlan cancunTrip() {
        return tourPlanBuilder.title("칸쿤여행")
                .nightsAndDays(2, 3)
                .startDate(LocalDate.of(2021, 12, 13))
                .whereToStay("리조트")
                .addPlan(0, "구경")
                .addPlan(0, "수영")
                .getPlan();
    }

    public TourPlan seoulTrip() {
        return tourPlanBuilder.title("서울여행")
                .startDate(LocalDate.of(2022, 1, 3))
                .getPlan();
    }
}
