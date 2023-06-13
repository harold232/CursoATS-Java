package sentenciaif;

public class SentenciaIf {

    public int factorial(int n) throws Exception {
        if (n < 0){
            throw new Exception("Factorial no admite negativo");
        }
        if ((n == 0) || (n == 1)){
            return 1;
        }
        
        return n * factorial (n - 1);
    }
    
    
    public static void main(String[] args) throws Exception {
        int respuesta;
        int k = 4;
        SentenciaIf si = new SentenciaIf();
        System.out.println(si.factorial(k));
    }
    
    /*tipo_retorno nombreMetodo (parámetros) excepciones
        Si el rango NO es válido
            Se lanza excepción
        Si es el CASO BASE
            Código del CASO BASE
    // si los valores son legales y NO es el caso BASE,
    // es el CASO RECURSIVO
            Código del CASO RECURSIVO*/
}
