package Figura;

public class Pentagono {
    private double lado;
    private String nombre;
    private double apotema;

    //Constructores
    public Pentagono(){

    }

    public Pentagono(String nombre){
        this.nombre = nombre;
    }

    public Pentagono (double lado, double apotema, String nombre){
        this.nombre = nombre;
        this.lado = lado;
        this.apotema = apotema;
    }

    public void setLado(double lado){
        this.lado = lado;
    }

    public double getLado(){
        return this.lado;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setApotema(double apotema){
        this.apotema = apotema;
    }

    public double getApotema(){
        return this.apotema;
    }

    public double calculaPerimetro(){
        return this.getLado()*5;
    }

    public double calculaArea(){
        return this.calculaPerimetro()*this.getApotema()/2;
    }

    public String toString(){
        return "El pentágono "+nombre+". Tiene los siguientes valores... Su area es: "+this.calculaArea()+"cm2 y su perimetro es: "+this.calculaPerimetro()+"cm.";
    }

    public void impValores(){
        System.out.println("El pentagono "+nombre+" mide: "+this.getLado()+"cm de lado");
    }

    public void impCalculos(){
        System.out.println(toString());
    }
}
