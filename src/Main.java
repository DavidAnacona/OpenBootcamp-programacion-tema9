public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setEdad(20);
        cliente.setNombre("David Anacona");
        cliente.setTelefono(3013744363L);
        cliente.setCredito(10.000);

        System.out.println("El cliente "+cliente.getNombre()+" con una edad de "+cliente.getEdad());
        System.out.println("Tiene un credito aprobado de "+cliente.getCredito()+" su numero de contacto es "+cliente.getTelefono());

        Trabajador trabajador = new Trabajador();
        trabajador.setEdad(40);
        trabajador.setNombre("Martin suarez");
        trabajador.setSalario(1200.000);
        trabajador.setTelefono(3219393833L);

        System.out.println("El trabajador "+trabajador.getNombre()+" tiene un edad de "+trabajador.getEdad());
        System.out.println("Tiene un salario de "+trabajador.getSalario()+" y su numero de contacto es "+trabajador.getTelefono());
    }

    static class Persona{
        private int edad;
        private String nombre;
        private long telefono;

        public Persona(){

        }

        public int getEdad() {
            return edad;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public long getTelefono() {
            return telefono;
        }

        public void setTelefono(long telefono) {
            this.telefono = telefono;
        }
    }

    static class Cliente extends Persona{
        private double credito;

        public double getCredito() {
            return credito;
        }

        public void setCredito(double credito) {
            this.credito = credito;
        }
    }

    static class Trabajador extends Persona{
        private double salario;



        public double getSalario() {
            return salario;
        }

        public void setSalario(double salario) {
            this.salario = salario;
        }
    }
}