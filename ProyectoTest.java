public class ProyectoTest {
    public static void main(String[] args) {
        Proyecto proyecto1 = new Proyecto();
        Proyecto proyecto2 = new Proyecto();
        Portafolio portafolio = new Portafolio();

        proyecto1.setName("EducaTech");
        proyecto1.setinitialCost(3000000.0);
        proyecto1.setDescripcion(
                "EducaTech es una plataforma de aprendizaje en línea que utiliza inteligencia artificial para personalizar el contenido educativo según las necesidades y el ritmo de aprendizaje de cada estudiante.");

        proyecto2.setName("EcoGreen");
        proyecto2.setinitialCost(2500000.0);
        proyecto2.setDescripcion(
                "EcoGreen es una iniciativa comunitaria que promueve la sostenibilidad ambiental a través de actividades educativas y prácticas ecológicas.");

        System.out.println(proyecto1.elevatorPitch());
        System.out.println(proyecto2.elevatorPitch());

        System.out.println("\n" + "Nombre Proyecto 1: " + proyecto1.getName()); // Prueba de getters
        System.out.println("Nombre Proyecto 2: " + proyecto2.getName()); // Prueba de getters

        System.out.println("\n" + "Descripcion Proyecto 1: " + proyecto1.getDescripcion()); // Prueba getters
        System.out.println("Descripcion Proyecto 2: " + proyecto2.getDescripcion()); // Prueba getters

        portafolio.addProyectos(proyecto1);
        portafolio.addProyectos(proyecto2);

        portafolio.showPortafolio();
    }
}
