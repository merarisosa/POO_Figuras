package Figura;

public class Cuadrado {
    private double lado;
    private String nombre;

    //Constructores
    public Cuadrado(){

    }

    public Cuadrado(String nombre){
        this.nombre = nombre;
    }

    public Cuadrado (double lado, String nombre){
        this.nombre = nombre;
        this.lado = lado;
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

    public double calculaArea(){
        return this.getLado()*this.getLado();
    }

    public double calculaPerimetro(){
        return this.getLado()*4;
    }

    public String toString(){
        return "El cuadrado "+nombre+". Tiene los siguientes valores... Su area es: "+this.calculaArea()+"cm2 y su perimetro es: "+this.calculaPerimetro()+"cm.";
    }

    public void impValores(){
        System.out.println("El cuadrado "+nombre+" mide: "+this.getLado()+"cm de lado");
    }

    public void impCalculo(){
        System.out.println(toString());
    }
}
