package Figura;

public class Circulo {
    private String nombre;
    private double radio;

    //Constructores
    public Circulo(){

    }

    public Circulo(String nombre){
        this.nombre = nombre;
    }

    public Circulo (double radio, String nombre){
        this.nombre = nombre;
        this.radio = radio;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setRadio(double radio){
        this.radio = radio;
    }

    public double getRadio(){
        return this.radio;
    }

    //metodos

    public double calculaArea(){
        return Math.PI*Math.pow(radio,2);
    }

    public double calculaPerimetro(){
        return Math.PI*(2*radio);
    }

    public String toString(){
        return "El circulo "+nombre+". Mide "+radio+"cm de radio. Su area es: "+this.calculaArea()+"cm2 y su perimetro es: "+this.calculaPerimetro()+"cm.";
    }

    public void imprimeResultado(){
        System.out.println(toString());
    }
}
