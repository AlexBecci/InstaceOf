package domain;

public class Gerente extends Empleado {

    private String departamento;

    public Gerente(String nombre, double sueldo, String departamento) {
        super(nombre, sueldo);
        this.departamento = departamento;
    }

    //Sobreescritura
    @Override//El compilador sabe que estamos sobreescribiendo el metodo de la clase Padre osea la clase Empleado a la clase Gerente
    public String obtenerDetalles()//Modificando el metodo de la clase padre en la clase hija
    {
        return super.obtenerDetalles() + "\nDepartamento: " + this.departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
}
