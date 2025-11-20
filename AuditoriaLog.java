package administracion.sistema;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;

public class AuditoriaLog {
    private List<LogEntry> registros;

    public AuditoriaLog() {
        this.registros = new ArrayList<>();
    }

    public void registrarLog(int idUsuario, String accion, String datosAfectados) {
        LogEntry log = new LogEntry(idUsuario, accion, datosAfectados);
        this.registros.add(log);
        System.out.println("LOG REGISTRADO: " + accion);
    }

    public List<LogEntry> auditarHistorial() {
        return registros;
    }

    private class LogEntry {
        Date fecha;
        int idUsuario;
        String accion;
        String datosAfectados;

        public LogEntry(int idUsuario, String accion, String datosAfectados) {
            this.fecha = new Date();
            this.idUsuario = idUsuario;
            this.accion = accion;
            this.datosAfectados = datosAfectados;
        }
    }
}