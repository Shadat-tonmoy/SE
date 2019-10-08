package CreationalPatterns.BuilderPattern;

public class Client
{
    public static void main(String args[])
    {
        Person person = new Person.Builder()
                .setFirstName("Shadat")
                .setLastName("Tonmoy")
                .setCountry("Bangladesh")
                .setCityName("Sherpur")
                .setHouseNumber("71/A")
                .setStreetNumber("Singhpara")
                .build();
        System.out.println("Person Details "+person.toString());

    }

}
