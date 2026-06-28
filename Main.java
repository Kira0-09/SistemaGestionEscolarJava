public class Main {

    public static void main(String[] args) {

        Estudiante alumno1 = new Estudiante("Josue Flores", "Ingeniería en Desarrollo de Software", 3);

        Estudiante alumno2 = new Estudiante("María González", "Administración de Empresas", 2);

        alumno1.mostrarDatos();

        System.out.println();

        alumno2.mostrarDatos();

    }

}

class Estudiante {

    String nombre;
    String carrera;
    int semestre;

    public Estudiante(String nombre, String carrera, int semestre) {
        this.nombre = nombre;
        this.carrera = carrera;
        this.semestre = semestre;
    }

    public void mostrarDatos() {
        System.out.println("===== SISTEMA DE GESTIÓN ESCOLAR =====");
        System.out.println("Nombre: " + nombre);
        System.out.println("Carrera: " + carrera);
        System.out.println("Semestre: " + semestre + "er tetra");
    }

}
