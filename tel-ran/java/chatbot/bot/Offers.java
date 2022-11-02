package com.vlad.bot;

import java.time.LocalDate;

// предложение
public class Offers {
    LocalDate dateFrom;
    LocalDate dateTo;
    String description;

    public Offers(LocalDate dateFrom, LocalDate dateTo, String description) {
        this.dateFrom = dateFrom;
        this.dateTo = dateTo;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Suggestion{" +
                "dateFrom=" + dateFrom +
                ", dateTo=" + dateTo +
                ", description='" + description + '\'' +
                '}';
    }

    public boolean checkExipired(){
        LocalDate localDate = LocalDate.now();
        return !(localDate.isAfter(dateTo)) && !(localDate.isBefore(dateFrom));
    }

    public boolean checkExipired(LocalDate localDate){
        return !(localDate.isAfter(dateTo)) && !(localDate.isBefore(dateFrom));
    }
}