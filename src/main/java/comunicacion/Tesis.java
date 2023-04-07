package comunicacion;

public class Tesis extends Escrito {
    private String idea;
    private String[] argumentos;
    private String conclusion;
    private String referencias;
    private String interpretacion;

    public Tesis(String origen,String titulo,String autor,int paginas,String idea,String[] argumentos, String conclusion,String referencias,String interpretacion){
        super(origen, titulo, autor, paginas);
        this.idea = idea;
        this.argumentos = argumentos;
        this.conclusion = conclusion;
        this.referencias = referencias;
        this.interpretacion = interpretacion;
    }

    // Métodos

    public int palabrasTotales(int num){
        return num*this.getPaginas()*5;
    }

    public String interpretacion(){
        return this.interpretacion;
    }

    public String toString(){
        String  r = this.getOrigen()+ "\n"; 
        r += this.getTitulo() + "\n";
        r += this.getAutor() + "\n"; 
        r += this.getPaginas()+ "\n";
        r += this.idea + "\n"; 
        r += this.argumentos.length + "\n"; 
        r += this.conclusion + "\n"; 
        r += this.referencias;

        return r;
    }

    // Gettes - Setters

    public void setIdea(String idea) {
        this.idea = idea;
    }

    public void setArgumentos(String[] argumentos) {
        this.argumentos = argumentos;
    }

    public void setConclusion(String conclusion) {
        this.conclusion = conclusion;
    }

    public void setReferencias(String referencias) {
        this.referencias = referencias;
    }

    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }

    public String getIdea() {
        return idea;
    }

    public String[] getArgumentos() {
        return argumentos;
    }

    public String getConclusion() {
        return conclusion;
    }

    public String getReferencias() {
        return referencias;
    }

    public String getInterpretacion() {
        return interpretacion;
    }  

}
