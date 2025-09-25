package week8.ex9;

import java.util.Objects;

public class RegistrationPlate {
    private final String regCode;
    private final String country;

    public RegistrationPlate(String regCode, String country) {
        this.regCode = regCode;
        this.country = country;
    }

    public String toString() {
        return country + " " + regCode;
    }


    @Override
    public boolean equals(Object o) {
        if (!(o instanceof RegistrationPlate)) return false;
        if (this == o) return true;
        RegistrationPlate that = (RegistrationPlate) o;
        return Objects.equals(this.regCode, that.regCode) &&
                Objects.equals(this.country, that.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(regCode, country);
    }
}
