package comunicacion;

public class Fabula extends Escrito {
    private String ensenanza;
    private String interpretacion;

    public Fabula(String origen,String titulo,String autor,int paginas,String ensenanza,String interpretacion){
        super(origen, titulo, autor, paginas);
        this.ensenanza = ensenanza;
        this.interpretacion = interpretacion;
    }

    // Métodos

    public int palabrasTotales(int num){
        return num*this.getPaginas()*1;
    }

    public String interpretacion(){
        return this.interpretacion;
    }

    public String toString(){
        String  r = this.getOrigen()+ "\n"; 
        r += this.getTitulo() + "\n";
        r += this.getAutor() + "\n"; 
        r += this.getPaginas()+ "\n";
        r += this.ensenanza;
        return r;
    }

    // Gettes - Setters

    public void setEnsenanza(String ensenanza) {
        this.ensenanza = ensenanza;
    }

    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }

    public String getEnsenanza() {
        return ensenanza;
    }

    public String getInterpretacion() {
        return interpretacion;
    }

}
