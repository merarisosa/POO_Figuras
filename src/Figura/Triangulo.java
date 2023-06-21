package Figura;

public class Triangulo {
    private String nombre;
    private double base;
    private double altura;

    //Constructores
    public Triangulo(){

    }

    public Triangulo(String nombre){
        this.nombre = nombre;
    }

    public Triangulo (double base, double altura, String nombre){
        this.nombre = nombre;
        this.base = base;
        this.altura = altura;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }

    public void setBase(double base){
        this.base = base;
    }

    public double getBase(){
        return base;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }

    public double getAltura(){
        return altura;
    }

    public double area(){
        return this.getBase() * this.getAltura()/2;
    }

    public double perimetro(){
        return this.getBase()*3;
    }

    public String toString(){
        return "El triángulo "+nombre+". Tiene de altura "+altura+ "cm y de base "+base+". Su area es "+this.area()+"cm2 y su perimetro es "+this.perimetro();
    }

    public void imprimir(){
        System.out.println(toString());
    }
}
