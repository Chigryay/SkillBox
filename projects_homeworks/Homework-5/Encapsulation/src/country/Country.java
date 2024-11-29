package country;

public class Country {
    private String countryName;
    private int Value;
    private String capitalCountry;

    public Country(String countryName) {
        this.countryName = countryName;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public int getValue() {
        return Value;
    }

    public void setValue(int value) {
        Value = value;
    }

    public String getCapitalCountry() {
        return capitalCountry;
    }

    public void setCapitalCountry(String capitalCountry) {
        this.capitalCountry = capitalCountry;
    }

    @Override
    public String toString() {
        return "Country{" +
                "countryName='" + countryName + '\'' +
                ", Value=" + Value +
                ", capitalCountry='" + capitalCountry + '\'' +
                '}';
    }
    
}
