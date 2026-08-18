package oops;

import java.time.*;

class Year extends DateTime {
    private int years2;

    public int getYears() {
        return years2;
    }

    public void setYears(int years2) {
        this.years2 = years2;
    }
}

class Data extends Year {
    private LocalDate years;

    public LocalDate getData() {
        return years;
    }

    public void setYears(LocalDate years) {
        this.years = years;
    }
}

class DateTime {
    private LocalTime time = LocalDateTime.now().atZone(ZoneId.systemDefault()).toLocalTime();

    public LocalTime getTime() {
        return time;
    }
}

public class Test {
    public static void main(String[] args) {
        Data a = new Data();

        // get year
        a.setYears(LocalDate.now().getYear());
        System.out.println(a.getYears());

        // get dd/mm/yyyy
        a.setYears(LocalDate.now());
        System.out.println(a.getData());

        // get time
        System.out.println(a.getTime());
    }
}
