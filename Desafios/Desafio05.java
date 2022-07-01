public class Desafio05 {
    
    public static void main(String[] args) {

        char[][] terrenos =    { {'0',  '0',  '0',  '0',  '0'},
                                {'0',  '1',  '0',  '1',  '0'},
                                {'0',  '0',  '1',  '0',  '0'},
                                {'0',  '0',  '1',  '0',  '0'}};   

        System.out.println(numTerrenos(terrenos) + " propriedades");
    }

    public static int numTerrenos(char[][] terrenos) {

        int numLinhas = terrenos.length;
        int numColunas = terrenos[0].length;

        char[][] terrenosSimplificados = new char[numLinhas][numColunas];
        int numTerrenos = 0;

        // copiando matriz dos terrenos
        for (int linha=0; linha<numLinhas; linha++) {
            for(int coluna=0; coluna<numColunas; coluna++) {
                terrenosSimplificados[linha][coluna] = terrenos[linha][coluna];
            }
        }

        // contando terrenos
        for (int linha=0; linha<numLinhas; linha++) {
            for(int coluna=0; coluna<numColunas; coluna++) {
                if(terrenosSimplificados[linha][coluna] == '1') {

                    numTerrenos += 1;
                    // percorre linha >>>>
                    int c = coluna + 1;
                    while(c<numColunas) {
                        if(terrenosSimplificados[linha][c]=='0')
                            break;
                        else
                            terrenosSimplificados[linha][c] = '0'; // limpa parte do mesmo terreno
                        c = c + 1;                  
                    }
                    // percorre coluna vvvv
                    int l = linha + 1;
                    while(l<numLinhas) {
                        if(terrenosSimplificados[l][coluna]=='0')
                            break;
                        else   
                            terrenosSimplificados[l][coluna] = '0'; // limpa parte do mesmo terreno
                        l = l + 1;
                    }
                }
            }
        }
    
    return numTerrenos;    
    }
}