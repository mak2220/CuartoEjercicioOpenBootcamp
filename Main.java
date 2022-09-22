public class Main {
    public static void main(String[] args) {
        Cliente marcos = new Cliente();
        marcos.edad = 39;
        marcos.nombre = "Marcos";
        marcos.telefono = 15407808;
        marcos.credito = "$ 500.000";
        Trabajador trabajador = new Trabajador();
        trabajador.edad = 40;
        trabajador.nombre = "Esteban";
        trabajador.telefono = 15407808;
        trabajador.credito = "$ 400.000";
        trabajador.salario = 350000;

        System.out.println(marcos.edad);
        System.out.println(marcos.nombre);
        System.out.println(marcos.telefono);
        System.out.println(marcos.credito);
        System.out.println(trabajador.edad);
        System.out.println(trabajador.nombre);
        System.out.println(trabajador.telefono);
        System.out.println(trabajador.credito);
        System.out.println(trabajador.salario);
    }
}

class Persona{
    public int edad;
    public String nombre;
    public int telefono;
}

class Cliente extends Persona{
    public String credito;
}

class Trabajador extends Cliente{
    public int salario;
}