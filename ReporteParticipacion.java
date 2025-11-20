package gestion.participacion;

import java.util.List;

public class ReporteParticipacion {
    public void generarReporteProyecto(int idProyecto, List<Asistencia> listaAsistencias) {
        double horasAcumuladas = 0.0;

        for (Asistencia a : listaAsistencias) {
            if (a.getEstado().equals("Aprobado")) {
                horasAcumuladas += a.getHorasRegistradas();
            }
        }
        System.out.println("--- Reporte Proyecto " + idProyecto + " ---");
        System.out.println("Horas acumuladas verificadas: " + horasAcumuladas);
    }
}