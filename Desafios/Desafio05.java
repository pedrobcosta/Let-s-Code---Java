public class Desafio05 {
    
    public int numTerrenos(char[][] terrenos) {

        char[][] novosTerrenos = new char[terrenos.length][terrenos[0].length];
        int numTerrenos = 0;

        for (int linha=0; linha<terrenos.length; linha++) {
            for(int coluna=0; coluna<terrenos.length; coluna++) {
                if(terrenos[linha][coluna] == '1') {

                    numTerrenos += 1;
                    int l = linha;
                    int c = coluna;
                    while(l>=0) {
                        l = l - 1;
                        if(terrenos[l][coluna]=='0')
                            break;
                        terrenos[l][coluna] = '0'; // limpa parte do mesmo terreno
                    }
                }
            }
        }
    
    return numTerrenos;
        
    }

}
