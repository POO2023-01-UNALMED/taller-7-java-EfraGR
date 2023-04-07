package comunicacion;

public class Alfabeto extends Pictograma {
    private String[] letras;
    private String interpretacion;

    public Alfabeto(String origen,String[] letras,String interpretacion){
        super(origen);
        this.letras = letras;
        this.interpretacion = interpretacion;
    }

    // Metodos

    public String interpretacion(){
        return this.interpretacion;
    }
    public String toString(){
        return "A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z";
    }

    public int cantidadLetras(){
        return letras.length;
    }

    // Getters - Setters
    
    public void setLetras(String[] letras) {
        this.letras = letras;
    }

    public String[] getLetras() {
        return letras;
    }

    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }

    public String getInterpretacion() {
        return interpretacion;
    }

}