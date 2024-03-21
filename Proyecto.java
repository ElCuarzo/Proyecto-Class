public class Proyecto {
    private String nombre;
    private String descripcion;
    private double initialCost;

    public Proyecto() {
        this.nombre = "Auto Electrico(";
        this.initialCost = 1000000.0;
        this.nombre = "): Los vehículos eléctricos son aquellos que utilizan uno o más motores eléctricos para propulsarse en lugar de motores de combustión interna.";
    }

    public Proyecto(String nombre) {
        this.nombre = nombre;
    }

    public Proyecto(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public Proyecto(String nombre, String descripcion, double initialCost) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.initialCost = initialCost;
    }

    public String getName() {
        return nombre;
    }

    public void setName(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getinitialCost() {
        return initialCost;
    }

    public void setinitialCost(double initialCost) {
        this.initialCost = initialCost;
    }

    public String elevatorPitch() {
        return "\n" + nombre + "(" + initialCost + ")" + ":" + descripcion;
    }
}