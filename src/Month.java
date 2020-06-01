enum Month {
    JANUARY("Styczeń"),
    FEBRUARY("Luty"),
    MARCH("Marzec"),
    APRIL("Kwiecień"),
    MAY("Maj"),
    JUNE("Czerwiec"),
    JULY("Lipiec"),
    AUGUST("Sierpień"),
    SEPTEMBER("Wrzesień"),
    OCTOBER("Październik"),
    NOVEMBER("Listopad"),
    DECEMBER("Grudzień");

    private final String description;

    Month(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Month{" +
                "description='" + description + '\'' +
                '}';
    }
}
