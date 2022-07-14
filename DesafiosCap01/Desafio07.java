import java.util.Scanner;

public class Desafio07 {
    
    public static void main(String[] args) {
        Desafio07 outputs = new Desafio07();
        outputs.Questao1();
        outputs.Questao2();
        outputs.Questao3();
    }

    public void Questao1() {

        Chapa chapa = new Chapa(6, 5, 100, -3, 
                                20, 20);

        while(!chapa.getEquilibrioTermico()) {
            chapa.distribuirCalor();
        }

        chapa.arredondarTemperaturas(2);
        System.out.println("Questão 1---------\n\n" + chapa.getRounds() + " rodadas\n");
        System.out.println("Chapa após última iteração:\n\n" + chapa.toString());   
    }

    public void Questao2() {

        Chapa chapa = new Chapa(6, 5, 100, -3, 
                                20, 20);
        
        System.out.println("Questão 2---------\n");           
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o número máximo de iterações: ");
        double numeroMaximoDeIteracoes = scan.nextInt();
        System.out.print("Digite erro máximo de permitido: ");
        double erroMaximo = scan.nextDouble();

        while(!chapa.getEquilibrioTermico() && 
               chapa.getRounds() < numeroMaximoDeIteracoes) {

            chapa.distribuirCalor();
            if(chapa.getErro() <= erroMaximo)    break;
        }

        System.out.println(chapa.getRounds() + " rodadas\n");
        System.out.println("Chapa após última iteração:\n\n" + chapa.toString());
    }

    public void Questao3() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Questão 3---------\n");
        System.out.println("Digite o número de linhas e colunas, respectivamente:");
        int linhas = scan.nextInt();
        int colunas = scan.nextInt();

        System.out.println("Digite as temperaturas das bordas:");
        System.out.print("Primeira coluna: ");double primeiraColuna = scan.nextDouble();
        System.out.print("Última coluna: ");double ultimaColuna = scan.nextDouble();
        System.out.print("Primeira linha: ");double primeiraLinha = scan.nextDouble();
        System.out.print("Última linha: ");double ultimaLinha = scan.nextDouble();

        System.out.println("\nDigite o número máximo de iterações:");
        int numeroMaximoDeIteracoes = scan.nextInt();
        System.out.println("Digite o erro máximo:");
        double erroMaximo = scan.nextDouble();
        System.out.println("Digite o número de casas decimais dos resultados:");
        int numeroCasasDecimais = scan.nextInt();

        Chapa chapa = new Chapa(linhas, colunas, primeiraColuna, ultimaColuna, primeiraLinha, ultimaLinha);
        
        while(!chapa.getEquilibrioTermico() && 
               chapa.getRounds() < numeroMaximoDeIteracoes) {

            chapa.distribuirCalor();
            if(chapa.getErro() <= erroMaximo)    break;
        }

        chapa.arredondarTemperaturas(numeroCasasDecimais);
        System.out.println(chapa.getRounds() + " rodadas\n");
        System.out.println("Chapa após última iteração:\n\n" + chapa.toString());
    }

    public class Chapa {

        private double[][] temperaturas;
        private int rounds;
        private boolean equilibrioTermico;
        private double erro;

        
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
            erro = 0;
            
            for(int linha=1 ; linha<temperaturas.length-1; linha++ ) {
                for(int coluna=1; coluna<temperaturas[0].length-1; coluna++) {
                    // calcula temperatura media dos vizinhos
                    double novaTemperatura = (temperaturas[linha][coluna-1] + temperaturas[linha-1][coluna] 
                    + temperaturas[linha][coluna+1] + temperaturas[linha+1][coluna])
                    /   4;
                    if(novaTemperatura != temperaturas[linha][coluna]) {
                        double novoErro = novaTemperatura - temperaturas[linha][coluna];
                        if(novoErro > erro)
                            erro = novoErro;
                            temperaturas[linha][coluna] = novaTemperatura;
                            this.equilibrioTermico = false;
                    }
                }
            }
            if(!this.equilibrioTermico)     
            this.rounds = this.rounds +1;
        }
        
        public void arredondarTemperaturas(int numeroCasasDecimais) {
                double escala = Math.pow(10, numeroCasasDecimais);

                for(int linha=0; linha<temperaturas.length; linha++) {
                    for(int coluna=0; coluna<temperaturas[0].length; coluna++) {
                        temperaturas[linha][coluna] = 
                            Math.round(temperaturas[linha][coluna] * escala) / escala;
                    }
                }
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
        
        // getters
        public int getRounds() {
            return this.rounds;
        }
        
        public boolean getEquilibrioTermico() {
            return this.equilibrioTermico;
        }

        public double getErro() {
            return erro;
        }
    }
}