class Mascota {
    private String nombre;
    private String especie;
    private double peso;
    private int edad;

    public Mascota(String nombre, String especie, double peso, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.peso = peso;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public double getPeso() {
        return peso;
    }

    public int getEdad() {
        return edad;
    }

    public void setPeso(double peso) {
        if (peso <= 0) {
            System.out.println("El peso debe ser mayor que cero para " + nombre);
        } else {
            this.peso = peso;
        }
    }

    public void setEdad(int edad) {
        if (edad < 0) {
            System.out.println("La edad no puede ser negativa para " + nombre);
        } else {
            this.edad = edad;
        }
    }

    public int valorConsulta() {
        int valor = 35000;

        if (peso > 25) {
            valor = 55000;
        } else if (peso > 10) {
            valor = 45000;
        }

        if (edad >= 8) {
            valor += 12000;
        }

        return valor;
    }

    public String descripcion() {
        return nombre + " (" + especie + ", " + peso + " kg, " + edad + " años)";
    }
}

public class Veterinaria {
        public static void main(String[] args) {
            Mascota[] pacientes = new Mascota[4];
            pacientes[0] = new Mascota("Zoe", "Perro", 28.5, 9);
            pacientes[1] = new Mascota("Manchas", "Gato", 4.2, 3);
            pacientes[2] = new Mascota("Rocko", "Perro", 12.0, 5);
        pacientes[3] = new Mascota("Abelardo", "Conejo", 2.1, 1);

        int totalRecaudado = 0;
        System.out.println("--- Registro de Consultas ---");

        for (int i = 0; i < pacientes.length; i++) {
            System.out.println(pacientes[i].descripcion() + "Valor: $" + pacientes[i].valorConsulta());
            totalRecaudado += pacientes[i].valorConsulta();
        }

        System.out.println("\nTotal recaudado: $" + totalRecaudado);
        System.out.println("\n--- Prueba de validación (set) ---");
        pacientes[1].setPeso(-3);
        System.out.println(pacientes[1].descripcion());
    }
     }

