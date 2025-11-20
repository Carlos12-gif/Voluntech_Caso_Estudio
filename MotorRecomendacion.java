package core.proyecto;

import core.usuario.Voluntario;
import java.util.List;

public class MotorRecomendacion {
    public static List<Proyecto> sugerirProyectos(Voluntario voluntario, List<Proyecto> listaProyectos) {
        System.out.println("Generando sugerencias para " + voluntario.getEmail());
        return listaProyectos;
    }
}