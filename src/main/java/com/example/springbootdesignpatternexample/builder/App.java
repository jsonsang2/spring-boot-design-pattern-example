package com.example.springbootdesignpatternexample.builder;

import java.time.LocalDate;

public class App {

    public static void main(String[] args) {

        TourPlanBuilder builder = new DefaultTourPlanBuilder();
        TourPlan plan = builder.title("칸쿤여행")
                .nightsAndDays(2, 3)
                .startDate(LocalDate.of(2021, 12, 13))
                .whereToStay("리조트")
                .addPlan(0, "구경")
                .addPlan(0, "수영")
                .getPlan();

        TourPlan seoulPlan = builder.title("서울여행")
                .startDate(LocalDate.of(2022, 1, 3))
                .getPlan();

        /**
         * Director Pattern을 사용해서 재사용을 줄일 수 있다.
         */
        TourDirector tourDirector = new TourDirector(new DefaultTourPlanBuilder());
        TourPlan tourPlan = tourDirector.cancunTrip();
        TourPlan seoulPlan2 = tourDirector.seoulTrip();

    }
}
