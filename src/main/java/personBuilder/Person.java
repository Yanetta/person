package personBuilder;

public class Person {
    private String personFirstName;
    private String personSurName;
    private String personCity;
    private int personAge;
    private int personHeight;

    private Person(Builder builder) {
        this.personFirstName = builder.firstName;
        this.personSurName = builder.surName;
        this.personCity = builder.city;
        this.personAge = builder.age;
        this.personHeight = builder.height;
    }


    public static Builder buildBuilder() {
        return new Builder();
    }

    public static final class Builder {
        private String firstName;
        private String surName;
        private String city;
        private int age;
        private int height;

        private Builder() {
        }

        public Builder buildFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder buildSurName(String surName) {
            this.surName = surName;
            return this;
        }

        public Builder buildCity(String city) {
            this.city = city;
            return this;
        }

        public Builder buildAge(int age) {
            this.age = age;
            return this;
        }

        public Builder buildHeight(int height) {
            this.height = height;
            return this;
        }

        public Person buildPerson() {
            return new Person(this);
        }
    }

    @Override
    public String toString() {
        return (getClass().getName() + "\n" +
                " first name: " + personFirstName + "\n" +
                " surname: " + personSurName + "\n" +
                " city: " + personCity + "\n" +
                " age: " + personAge + "\n" +
                " height: " + personHeight);
    }
}




