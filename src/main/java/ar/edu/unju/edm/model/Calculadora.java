package ar.edu.unju.edm.model;

import org.springframework.stereotype.Component;

@Component
public class Calculadora {
	 private int n1;
	 private int n2;
	 public Calculadora (){
		 // TODO Auto-generated constructor stub
	 }
	public int getN1() {
		return n1;
	}
	public void setN1(int n1) {
		this.n1 = n1;
	}
	public int getN2() {
		return n2;
	}
	public void setN2(int n2) {
		this.n2 = n2;
	}
	public int sumaNumero() {
		return n1 + n2;
	}
	public int restaNumero() {
		return n1 - n2;
	}
    public float divisionNumero() {
    	float resultado=0;
    	
    	if(n2!=0) {
    		resultado=(float)n1/(float)n2;
    	}else {
    		System.out.println("No se puede divisir por 0");
    	}
		return resultado;
    }
    
	public int multiplicacionNumero() {
		return n1 * n2;
    }
	
	public int potenciaNumero() {
	      int potencia = 1;
	      for (int i=1; i<=n2; i++) {
	    	potencia=potencia*n1;  
	      }
	      return potencia;
	  }
	
    public double raizNumero() {
    	double resultado=0;
    	
    	if (n2!=0) {
    		resultado = Math.pow((double)n1, 1/(double)n2);
    	}else {
    		System.out.println("El indice no puede ser 0");
    	}
    	return resultado;
    }
}