package org.xander.Builder;

public class Person {
    private String lastName;
    private String firstName;
    private String middleName;
    private String salutation;
    private String suffix;
    private String streetAddress;
    private String city;
    private String state;
    private boolean isFemale;
    private boolean isEmployed;
    private boolean isHomeOwner;

    public Person() {
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getSalutation() {
        return salutation;
    }

    public String getSuffix() {
        return suffix;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public boolean isFemale() {
        return isFemale;
    }

    public boolean isEmployed() {
        return isEmployed;
    }

    public boolean isHomeOwner() {
        return isHomeOwner;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setSalutation(String salutation) {
        this.salutation = salutation;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setFemale(boolean female) {
        isFemale = female;
    }

    public void setEmployed(boolean employed) {
        isEmployed = employed;
    }

    public void setHomeOwner(boolean homeOwner) {
        isHomeOwner = homeOwner;
    }

    @Override
    public String toString() {
        return "Person{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", salutation='" + salutation + '\'' +
                ", suffix='" + suffix + '\'' +
                ", streetAddress='" + streetAddress + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", isFemale=" + isFemale +
                ", isEmployed=" + isEmployed +
                ", isHomeOwner=" + isHomeOwner +
                '}';
    }

    public static Builder newBuilder() {
        return new Person().new Builder();
    }

    public class Builder {

        private Builder() {
            // private constructor
        }

        public Builder setLastName(String lastName) {
            Person.this.lastName = lastName;

            return this;
        }

        public Builder setFirstName(String firstName) {
            Person.this.firstName = firstName;

            return this;
        }

        public Builder setMiddleName(String middleName) {
            Person.this.middleName = middleName;

            return this;
        }

        public Builder setSalutation(String salutation) {
            Person.this.salutation = salutation;

            return this;
        }

        public Builder setSuffix(String suffix) {
            Person.this.suffix = suffix;

            return this;
        }

        public Builder setStreetAddress(String streetAddress) {
            Person.this.streetAddress = streetAddress;

            return this;
        }

        public Builder setCity(String city) {
            Person.this.city = city;

            return this;
        }

        public Builder setState(String state) {
            Person.this.state = state;

            return this;
        }

        public Builder setFemale(boolean isFemale) {
            Person.this.isFemale = isFemale;

            return this;
        }

        public Builder setEmployed(boolean isEmployed) {
            Person.this.isEmployed = isEmployed;

            return this;
        }

        public Builder setHomeOwner(boolean isHomeOwner) {
            Person.this.isHomeOwner = isHomeOwner;

            return this;
        }

        public Person build() {
            return Person.this;
        }
    }
}
