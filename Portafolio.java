import java.util.ArrayList;

public class Portafolio {
    private ArrayList<Proyecto> proyectos;

    public Portafolio() {
        this.proyectos = new ArrayList<Proyecto>();
    }

    public ArrayList<Proyecto> getProyectos() {
        return proyectos;
    }

    public void setProyectos(ArrayList<Proyecto> proyectos) {
        this.proyectos = proyectos;
    }

    public void addProyectos(Proyecto proyecto) {
        proyectos.add(proyecto);
    }

    public double getPortafolioCosto() {
        double totalCost = 0.0;
        for (Proyecto proyecto : proyectos) {
            totalCost += proyecto.getinitialCost();
        }
        return totalCost;
    }

    public void showPortafolio() {
        for (Proyecto proyecto : proyectos) {
            System.out.println(proyecto.elevatorPitch());
        }
        System.out.println("\n" + "Costo total del portafolio es: " + getPortafolioCosto());
    }
}
