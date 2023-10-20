package main;
public class App {
    public static int encontre(int[] arrayOrdenado, int num){
        for(int i = 0; i < arrayOrdenado.length; i++) {
            if (arrayOrdenado[i] == num) {
                return 1;
            }
        }
        return 0;
    }

    public static int maior(int[] arrayDesordenado){
        // Aplicação simples: não implementamos tratamento de erros, como por exemplo verificar se o 
        // array não está vazio ou é nulo.
        int maiorNumero = arrayDesordenado[0];
        for(int i = 1; i < arrayDesordenado.length; i++) {
            if (arrayDesordenado[i] > maiorNumero) {
                maiorNumero = arrayDesordenado[i];
            }
        }
        return maiorNumero;
    }

    public static Integer parMaisProximo(Integer[][] pares){
        // Condição que garante que o array não seja vazio e tenha ao menos 2 pontos.
        if (pares.length == 0 || pares[0].length < 2) {
            return null;
        } else {
            Integer menorDistancia = (int) Math.sqrt(Math.pow(pares[1][0] - pares[0][0], 2)
                    + Math.pow(pares[1][1] - pares[0][1], 2));
            for (int i = 0; i < pares.length - 1; i++) {
                for (int j = i + 1; j < pares.length; j++) {
                    Integer algumaDistancia = (int) Math.sqrt(Math.pow(pares[j][0] - pares[i][0], 2)
                            + Math.pow(pares[j][1] - pares[i][1], 2));
    
                    if (algumaDistancia < menorDistancia) {
                        menorDistancia = algumaDistancia;
                    }
    
                }
            }
    
            return menorDistancia;
        }
    }
}
