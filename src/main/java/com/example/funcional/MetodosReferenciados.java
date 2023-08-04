package com.example.funcional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MetodosReferenciados {

	private static final Logger LOG = LoggerFactory.getLogger(MetodosReferenciados.class);

	public Integer getID() {
		return 8;
	}

	public void aceptar(String arg) {
		String cadena = "Christian";
		LOG.info(cadena+ " " +arg);

	}
	
	public boolean evaluar(Integer valor) {
		Integer valor2 = 10;
		valor = valor + valor2;
		if (valor.compareTo(100) > 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public String aplicar(Integer numero) {
		String valorFinal = numero.toString().concat("Valor");
		return valorFinal;
		
	}
	
	public Integer aplicarUnari1(Integer numero) {
		Integer valor = numero+(numero*2);
		return valor;
		
	}
	
	// SUPPLIER
    public static String saludoAleatorio() {
        String[] saludos = {"Hola", "¡Buenos días!", "Saludos", "¡Hola a todos!"};
        int indice = (int) (Math.random() * saludos.length);
        return saludos[indice];
    }

    // CONSUMER
    public static void saludoPersonalizado(String nombre) {
        LOG.info("Hola, " + nombre + ". ¡Bienvenido!");
    }

    // PREDICATE
    public static boolean esPositivo(Integer num) {
        boolean resultado = num > 0;
        if (resultado) {
            LOG.info("El número " + num + " es positivo.");
        } else {
            LOG.info("El número " + num + " no es positivo.");
        }
        return resultado;
    }

    // FUNCTION
    public static String convertirAMayusculas(String nombre) {
        String mayusculas = nombre.toUpperCase();
        LOG.info("Nombre en mayúsculas: " + mayusculas);
        return mayusculas;
    }

    // UnaryOperator
    public static Integer restarUno(Integer num) {
        int resultado = num - 1;
        LOG.info("Número " + num + " - 1 = " + resultado);
        return resultado;
    }
	
}
