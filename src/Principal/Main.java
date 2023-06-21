package Principal;

import Figura.Circulo;
import Figura.Cuadrado;
import Figura.Pentagono;
import Figura.Triangulo;

import java.util.Vector;
import java.util.Scanner;

public class Main {

    public static Scanner dato = new Scanner(System.in);
    public static int opc;
    static Vector<Triangulo> triangulos = new Vector<Triangulo>();
    static Vector<Cuadrado> cuadrados = new Vector<Cuadrado>();
    static Vector<Circulo> circulos = new Vector<Circulo>();
    static Vector<Pentagono> pentagonos = new Vector<Pentagono>();

    public static void main(String[] args) {
            do {
                menu();
                switch (opc) {
                    case 1:
                        altaTriangulo();
                        System.out.println("Seleccionaste altaTriangulo");
                        break;
                    case 2:
                        altaCuadrado();
                        System.out.println("Seleccionaste altaCuadrado");
                        break;
                    case 3:
                        altaPentagono();
                        System.out.println("Seleccionaste altaPentagono");
                        break;
                    case 4:
                        altaCirculo();
                        System.out.println("Seleccionaste altaCirculo");
                        break;
                    case 5:
                        imprimirBD();
                        System.out.println("Seleccionaste imprimirBD");
                        break;
                    case 6:
                        System.out.println("Adios!");
                        break;
                    default:
                        System.out.println("Ups! Esta opción no existe");
                }
            } while (opc != 6);
        }
        public static void menu() {
            System.out.println("MENU FIGURAS");
            System.out.println("Selecciona el numero correspondiente a la figura que quieras registrar: ");
            System.out.println("1. alta Triangulos");
            System.out.println("2. alta Cuadrados");
            System.out.println("3. alta Pentagonos");
            System.out.println("4. alta Circulos");
            System.out.println("5. imprimir BD");
            System.out.println("6. salir");
            opc = dato.nextInt();
        }
        public static void altaTriangulo() {
            System.out.println("Deme nombre del Triangulo: ");
            String nombre = dato.next();
            System.out.println("Deme la base: ");
            double base = dato.nextDouble();
            System.out.println("Deme la altura: ");
            double altura = dato.nextDouble();
            //agregar el traingulo al vector
            triangulos.addElement(new Triangulo(base, altura, nombre));
        }
        public static void altaCuadrado() {
            System.out.println("Deme nombre del Cuadrado: ");
            String nombre = dato.next();
            System.out.println("Deme el lado: ");
            double lado = dato.nextDouble();
//agregar el cuadrado al vector
            cuadrados.addElement(new Cuadrado(lado, nombre));
        }
        public static void altaCirculo() {
            System.out.println("Deme nombre del Circulo: ");
            String nombre = dato.next();
            System.out.println("Deme el radio: ");
            double radio = dato.nextDouble();
//agregar el circulo al vector
            circulos.addElement(new Circulo(radio, nombre));
        }
        public static void altaPentagono() {
            System.out.println("Deme nombre del Pentagono: ");
            String nombre = dato.next();
            System.out.println("Deme el lado: ");
            double lado = dato.nextDouble();
            System.out.println("Deme el apotema: ");
            double apotema = dato.nextDouble();
//agregar el traingulo al vector
            pentagonos.addElement(new Pentagono(lado, apotema, nombre));
        }
        public static void imprimirBD(){
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


