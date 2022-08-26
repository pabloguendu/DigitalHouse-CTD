public class Perro {
    private String raza;
    private Integer anioNacimiento;
    private Double peso;
    private Boolean chip;
    private String nombre;
    private Boolean lastimado;
    private Integer edad;

    public Perro(String raza, Integer anioNacimiento, Double peso, Boolean chip, String nombre, Boolean lastimado) {
        this.raza = raza;
        this.anioNacimiento = anioNacimiento;
        this.peso = peso;
        this.chip = chip;
        this.nombre = nombre;
        this.lastimado = lastimado;
    }

    public Perro(String raza, Integer anioNacimiento, Double peso, Boolean chip, String nombre, Boolean lastimado, Integer edad) {
        this.raza = raza;
        this.anioNacimiento = anioNacimiento;
        this.peso = peso;
        this.chip = chip;
        this.nombre = nombre;
        this.lastimado = lastimado;
        this.edad = edad;
    }

    public Boolean getChip() {
        return chip;
    }

    public void esAdoptable() {
        if (chip == true) {
            if (lastimado == false && peso > 5.0) {
                System.out.println("Es adoptable");
            } else {
                System.out.println("No es adoptable");
            }
        }
    }
}
