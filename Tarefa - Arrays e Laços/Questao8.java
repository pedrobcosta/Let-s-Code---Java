import java.util.Scanner;

public class Questao8 {
    
    public static void main(String[] args) {
        System.out.println("Digite os dados de 5 pessoas, em sequência (Nome, Altura em metros, Peso em kg):");
        Person[] people = new Questao8().readPeople(5);

        for(Person currentPerson : people ) {
            double imc = currentPerson.imc();
            if(imc < 18.5)
                System.out.println("O peso de " + currentPerson.getName() + " está ABAIXO do ideal");
            else if(imc > 25)
                System.out.println("O peso de " + currentPerson.getName() + " está ACIMA do ideal");
            else
            System.out.println("O peso de " + currentPerson.getName() + " está ideal");
        }
    }

    public Person[] readPeople(int n) {
        Person[] people = new Person[n];
        Scanner input = new Scanner(System.in);;
        for(int i=0; i<n; i++) {
            input = new Scanner(System.in);

            people[i] = new Person();
            people[i].setName(input.nextLine());
            // System.out.println(i);
            people[i].setHeight(input.nextDouble());
            people[i].setWeight(input.nextDouble());

        }
        input.close();
        return people;
    }

    public class Person {

        private String name;
        private double height;
        private double weight;

        public double imc() {
            return this.weight/Math.pow(this.height,2);
        }

        // getters
        public String getName() {
            return name;
        }
        public double getHeight() {
            return height;
        }
        public double getWeight() {
            return weight;
        }

        // setters
        public void setName(String name) {
            this.name = name;
        }
        public void setHeight(double height) {
            this.height = height;
        }
        public void setWeight(double weight) {
            this.weight = weight;
        }
    }
}