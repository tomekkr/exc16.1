import java.util.Arrays;

enum Season {
    SPRING("WIOSNA",
            new Month[]{Month.MARCH, Month.APRIL, Month.MAY}),
    SUMMER("LATO",
            new Month[]{Month.JUNE, Month.JULY, Month.AUGUST}),
    AUTUMN("JESIEŃ",
            new Month[]{Month.SEPTEMBER, Month.OCTOBER, Month.NOVEMBER}),
    WINTER("ZIMA",
            new Month[]{Month.DECEMBER, Month.JANUARY, Month.FEBRUARY});

    private final String description;
    private final Month[] months;

    Season(String description, Month[] months) {
        this.description = description;
        this.months = months;
    }

    public String getDescription() {
        return description;
    }

    public static Season fromDescription(String description) {
        Season[] seasonsAllValues = values();
        for (Season season : seasonsAllValues) {
            if (season.getDescription().equals(description))
                return season;
        }
        throw new IllegalArgumentException("Niepoprawna nazwa pory roku");
    }


    public void printSeasonInfo() {
        System.out.println(description + " zawiera miesiące: ");
        printMonthsInfo();
    }

    private void printMonthsInfo() {
        for (Month month : months) {
            System.out.println(month.getDescription());
        }
    }

    @Override
    public String toString() {
        return "Season{" +
                "description='" + description + '\'' +
                ", months=" + Arrays.toString(months) +
                '}';
    }
}
