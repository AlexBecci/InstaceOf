package test;

import domain.Empleado;
import domain.Gerente;

public class TestInstanceOf {
    
    public static void main(String[] args) {
        
        Empleado empleado = new Empleado("Ricardo", 1000);
       determinarTipo(empleado);
        empleado = new Gerente("Karla", 2400, "Contabilidad");
       // determinarTipo(empleado);

        
    }

    public static void determinarTipo(Empleado empleado) {
        if (empleado instanceof Gerente) {
            System.out.println("Es de tipo Gerente");
            //formas de pasar la variable a tipo hijo
            Gerente gerente = (Gerente)empleado;
            System.out.println("gerente = " + gerente.getDepartamento());
            //((Gerente) empleado).getDepartamento();
        }
        else if(empleado instanceof Empleado)
        {
            System.out.println("Es de tipo Empleado");
            System.out.println("empleado = " + empleado.obtenerDetalles());
        }
        else if(empleado instanceof Object)
        {
            System.out.println("Es de tipo Object");
            empleado.toString();
        }
    }
    //INSTANCE OF SE PUEDE utilizar para cambiar un tiopo de dato
    //de una variable de tipo padre a tipo hijo
}
