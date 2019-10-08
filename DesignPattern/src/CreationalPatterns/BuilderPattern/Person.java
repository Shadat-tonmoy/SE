package CreationalPatterns.BuilderPattern;

public class Person
{
    private String firstName, lastName, houseNumber,streetNumber,cityName, country, phoneNumber;

    public Person(Builder builder)
    {
        this.firstName  = builder.firstName;
        this.lastName  = builder.lastName;
        this.houseNumber  = builder.houseNumber;
        this.streetNumber  = builder.streetNumber;
        this.cityName  = builder.cityName;
        this.country  = builder.country;
        this.phoneNumber  = builder.phoneNumber;
    }

    public static class Builder
    {
        private String firstName, lastName, houseNumber,streetNumber,cityName, country, phoneNumber;

        public Builder()
        {

        }

        public Builder setFirstName(String firstName)
        {
            this.firstName = firstName;
            return this;
        }

        public Builder setLastName(String lastName)
        {
            this.lastName = lastName;
            return this;
        }

        public Builder setHouseNumber(String houseNumber)
        {
            this.houseNumber = houseNumber;
            return this;
        }

        public Builder setStreetNumber(String streetNumber)
        {
            this.streetNumber = streetNumber;
            return this;
        }

        public Builder setCityName(String cityName)
        {
            this.cityName = cityName;
            return this;
        }

        public Builder setCountry(String country)
        {
            this.country = country;
            return this;
        }

        public Builder setPhoneNumber(String phoneNumber)
        {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Person build()
        {
            return new Person(this);
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", houseNumber='" + houseNumber + '\'' +
                ", streetNumber='" + streetNumber + '\'' +
                ", cityName='" + cityName + '\'' +
                ", country='" + country + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
