package personBuilder;

public class Main {

    public static void main(String[] args) {
        Person sasha = Person.buildBuilder().buildFirstName("Sasha").buildSurName("Shovkovsky").buildAge(42).buildCity("Kyiv").buildHeight(180).buildPerson();
        System.out.println(sasha);
    }
}
