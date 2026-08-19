package companies.ibm;

public class Ordering_List_Dates {
    public static void main(String[] args) {
        String[] dates = {
                "04-1967",
                "10-2012",
                "06-2012",
                "01-1989",
                "12-2000"
        };


        sort(dates);

        for (String date : dates) {
            System.out.println(date);
        }
    }

    static void sort(String[] dates) {

        for (int i = 0; i < dates.length - 1; i++) {
            for (int j = i + 1; j < dates.length; j++) {

                int year1 = Integer.parseInt(dates[i].substring(3));
                int month1 = Integer.parseInt(dates[i].substring(0, 2));

                int year2 = Integer.parseInt(dates[j].substring(3));
                int month2 = Integer.parseInt(dates[j].substring(0, 2));

                int date1 = year1 * 100 + month1;
                int date2 = year2 * 100 + month2;

                if (date1 > date2) {
                    String temp = dates[i];
                    dates[i] = dates[j];
                    dates[j] = temp;
                }
            }
        }
    }
}
