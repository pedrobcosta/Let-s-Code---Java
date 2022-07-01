import java.util.Scanner;

public class Desafio07 {
    
    public static void main(String[] args) {
        Desafio07 outputs = new Desafio07();
        outputs.Questao1();
    }

    public void Questao1() {

        Chapa chapa = new Chapa(6, 5, 100, -3, 
                                20, 20);

        while(!chapa.getEquilibrioTermico()) {
            chapa.distribuirCalor();
        }
        System.out.println(chapa.getRounds());     
    }

    public void Questao2() {

        Chapa chapa = new Chapa(6, 5, 100, -3, 
                                20, 20);
        
        Scanner scan = new Scanner(System.in);
        double erro = scan.nextDouble();
        
    }

    public class Chapa {

        private double[][] temperaturas;
        private int rounds;
        private boolean equilibrioTermico;

        Chapa(int numLinhas, int numColunas, 
              double primeiraColuna, double ultimaColuna, double primeiraLinha, double ultimaLinha) {

            this.rounds = 0;
            temperaturas = new double[numLinhas][numColunas];
            // preenchendo extremidades
            for(int coluna=0 ; coluna<numColunas; coluna++ ) {
                temperaturas[0][coluna] = primeiraLinha;
            }
            for(int coluna=0 ; coluna<numColunas; coluna++ ) {
                temperaturas[numLinhas-1][coluna] = ultimaLinha;
            }
            for(int linha=1 ; linha<numLinhas-1; linha++ ) {
                temperaturas[linha][0] = primeiraColuna;
            }
            for(int linha=1 ; linha<numLinhas-1; linha++ ) {
                temperaturas[linha][numColunas-1] = ultimaColuna;
            }
            // preenchendo zeros internos
            for(int linha=1; linha<numLinhas-1; linha++){
                for(int coluna=1; coluna<numColunas-1; coluna++) {
                    temperaturas[linha][coluna] = 0d;
                }
            }
        }

        public void distribuirCalor() { 

            this.equilibrioTermico = true;

            for(int linha=1 ; linha<temperaturas.length-1; linha++ ) {
                for(int coluna=1; coluna<temperaturas[0].length-1; coluna++) {
                    // calcula temperatura media dos vizinhos
                    double novaTemperatura = (temperaturas[linha][coluna-1] + temperaturas[linha-1][coluna] 
                                                  + temperaturas[linha][coluna+1] + temperaturas[linha+1][coluna])
                                                /   4;
                    if(novaTemperatura != temperaturas[linha][coluna]) {
                        temperaturas[linha][coluna] = novaTemperatura;
                        this.equilibrioTermico = false;
                    }

                }
            }
            if(!this.equilibrioTermico)     
                this.rounds = this.rounds +1;
        }

        @Override
        public String toString() {

            String chapaEmString = "";
            for(int linha=0 ; linha<temperaturas.length; linha++ ) {
                chapaEmString += "[";
                for(int coluna=0; coluna<temperaturas[0].length; coluna++) {
                    chapaEmString += temperaturas[linha][coluna];
                    if(coluna==temperaturas[0].length-1)
                        chapaEmString += "]\n";
                    else
                        chapaEmString += ", ";
                }
            }
            return chapaEmString;
        }

        public int getRounds() {
            return this.rounds;
        }

        public boolean getEquilibrioTermico() {
            return this.equilibrioTermico;
        }
    }
}
