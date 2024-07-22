package Course1.enumeration;

public enum Days {
    MONDAY("MON"),
    TUESDAY("TUE"),
    WEDNESDAY("WED"),
    SUNDAY("SUN"),
    THURSDAY("THU"),
    FRIDAY("FRI");

    private String abbr;

    Days(String abbr) {
        this.abbr = abbr;
    }

    public String getAbbr() {
        return abbr;
    }

    public void setAbbr(String abbr) {
        this.abbr = abbr;
    }
}