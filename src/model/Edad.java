package model;

import java.util.Calendar;

public class Edad {
    public static int calcularEdad(int ano, int mes, int dia) {
        Calendar fechaActual = Calendar.getInstance();
        int anoActual = fechaActual.get(Calendar.YEAR);
        int mesActual = fechaActual.get(Calendar.MONTH) + 1;
        int diaActual = fechaActual.get(Calendar.DAY_OF_MONTH);

        if (ano < 1900 || ano > 2024) {
            throw new IllegalArgumentException("El año debe ser mayor o igual a 1900 y no puede ser mayor a 2024.");
        }

        if (mes < 1 || mes > 12) {
            throw new IllegalArgumentException("El mes debe ser mayor o igual a 1 y no puede ser mayor a 12.");
        }

        if (dia < 1) {
            throw new IllegalArgumentException("El día debe ser mayor o igual a 1.");
        }

        if (dia > 31) {
            throw new IllegalArgumentException("El día no puede ser mayor a 31.");
        }

        if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia > 30) {
            throw new IllegalArgumentException("El día no puede ser mayor a 30 para el mes " + mes + ".");
        }

        if (ano > anoActual) {
            throw new IllegalArgumentException("El año no puede ser mayor al año actual.");
        }

        int edad = anoActual - ano;

        if (mes > mesActual) {
            edad--;
        } else if (mes == mesActual && dia > diaActual) {
            edad--;
        }

        return edad;
    }
}
  
