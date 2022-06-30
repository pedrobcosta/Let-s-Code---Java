import java.util.Scanner;

public class Questao7 {
    public static void main(String[] args) {
        System.out.println("Informe o nome e a idade de cada uma das 5 pessoas, em sequência:");
        Person[] people = new Questao7().readPeople(5);
        
        System.out.println("A pessoa mais jovem da lista é " + youngest(people).getName());
        System.out.println("A pessoa mais velha da lista é " + oldest(people).getName());
        System.out.println("A média de idade é " + averageAge(people));
    }

    public Person[] readPeople(int n) {
        Person[] people = new Person[n];
        Scanner input = new Scanner(System.in);;
        for(int i=0; i<n; i++) {
            input = new Scanner(System.in);

            people[i] = new Person();
            people[i].setName(input.nextLine());
            people[i].setAge(input.nextInt());

        }
        input.close();
        return people;
    }

    public static Person oldest(Person[] people) {
        Person oldestPerson = people[0];
        for(Person currentPerson : people) {
            if(currentPerson.getAge() > oldestPerson.getAge())
                oldestPerson = currentPerson;
        }
        return oldestPerson;
    }

    public static Person youngest(Person[] people) {
        Person youngestPerson = people[0];
        for(Person currentPerson : people) {
            if(currentPerson.getAge() < youngestPerson.getAge())
                youngestPerson = currentPerson;
        }
        return youngestPerson;
    }

    public static double averageAge(Person[] people) {
        int sum = 0;
        for(Person currentPerson : people) {
            sum = sum + currentPerson.getAge();
        }
        return sum*1.0d/people.length;
    }

    public class Person {

        private String name;
        private int age;

        // getters
        public String getName() {
            return name;
        }
        public int getAge() {
            return age;
        }

        // setters
        public void setName(String name) {
            this.name = name;
        }
        public void setAge(int age) {
            this.age = age;
        }
    }

}