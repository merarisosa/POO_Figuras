package Tester;

import Figura.Circulo;
import Figura.Cuadrado;
import Figura.Pentagono;
import Figura.Triangulo;
import java.util.Vector;

public class Tester {
    public static void main(String[] args) {
        Triangulo t1 = new Triangulo(4.5, 5.1, "Triangulo 1");
        Triangulo t2 = new Triangulo(5.5, 5.1, "Triangulo 2");
        Triangulo t3 = new Triangulo(5.9, 5.9, "Triangulo 3");

        Cuadrado c1 = new Cuadrado(4.5, "Cuadrado 1");
        Cuadrado c2 = new Cuadrado(6.6, "Cuadrado 2");
        Cuadrado c3 = new Cuadrado(7.6, "Cuadrado 3");

        Pentagono p1 = new Pentagono(3.6, 4.5, "Pentagono 1");
        Pentagono p2 = new Pentagono(4.6, 5.5, "Pentagono 2");
        Pentagono p3 = new Pentagono(5.6, 6.5, "Pentagono 3");

        Circulo ci1 = new Circulo(8.7, "Circulo 1");
        Circulo ci2 = new Circulo(5.6, "Circulo 2");
        Circulo ci3 = new Circulo(9.8, "Circulo 3");

        Vector<Triangulo> triangulos = new Vector<Triangulo>();
        Vector<Cuadrado> cuadrados = new Vector<Cuadrado>();
        Vector<Circulo> circulos = new Vector<Circulo>();
        Vector<Pentagono> pentagonos = new Vector<Pentagono>();

        circulos.addElement(ci1);
        circulos.addElement(ci2);
        circulos.addElement(ci3);

        pentagonos.addElement(p1);
        pentagonos.addElement(p2);
        pentagonos.addElement(p3);

        triangulos.addElement(t1);
        triangulos.addElement(t2);
        triangulos.addElement(t3);

        cuadrados.addElement(c1);
        cuadrados.addElement(c2);
        cuadrados.addElement(c3);

        System.out.println("Impresiones desde ciclos for para cada vector");
        for (int i = 0; i < triangulos.size(); i++) {
            triangulos.elementAt(i).imprimir();
        }
        for (int i = 0; i < cuadrados.size(); i++) {
            cuadrados.elementAt(i).impCalculo();
        }
        for (int i = 0; i < pentagonos.size(); i++) {
            pentagonos.elementAt(i).impCalculos();
        }
        for (int i = 0; i < circulos.size(); i++) {
            circulos.elementAt(i).imprimeResultado();
        }
    }
}
