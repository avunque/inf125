// File available at IDEOne: https://ideone.com/nNR6Fs

// Superclass: Figuras
// Subclasses of Figuras: Circulo, Rectangulo
// Subclasses of Rectangulo: Cuadrado

import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class Figuras {
	protected String tipo;
	public String toString() {
		return tipo;	
	}
}//cierre de la clase Figuras
 
class Circulo extends Figuras {
	private double radio;
	Circulo (double r) {
		radio = r;
		tipo = "Circulo";
	}
 
	double area() {
		return Math.PI * radio * radio;
	}
 
	void setRadio(double r) {
		radio = r;
	}
	double getRadio() {
		return radio;
	}
} // cierre clase Circulo
 
class Rectangulo extends Figuras {
    private double altura, base;
    Rectangulo(double al, double ba) {
    	altura = al;
    	base = ba;
    	this.tipo = "Rectangulo";
    }
 
    void setAltura(double al) {
        altura = al;
    }
    double getAltura() {
        return altura;
    }
 
	double area() {
		return altura * base;
	}
 
	void setBase(double ba) {
		base = ba;
	}
    double getBase() {
        return base;
	}
}// cierre de la clase rectangulo
 
class Cuadrado extends Rectangulo {
    Cuadrado (double l) {
    	super(l,l);
    	this.tipo = "Cuadrado";
    }
} // cierre de Cuadrado
 
class Main {
 
public static void main (String[] args) throws java.lang.Exception {
 
	Circulo circo = new Circulo(2);
 
	Rectangulo rect = new Rectangulo(2, 3);
 
	Cuadrado cua = new Cuadrado(4);
 
 
	System.out.println(circo + ": Radio = " + circo.getRadio() );
	System.out.println(circo + ": Area = " + circo.area() );
 
	System.out.println(rect + ": Altura = " + rect.getAltura() );
	System.out.println(rect + ": Area = " + rect.area() );
 
	System.out.println(cua + ": Area = " + cua.area() );
	System.out.println(cua + ": Lado = " + cua.getBase() );
 
	} // cierre del main
 
} // cierre clase Main
