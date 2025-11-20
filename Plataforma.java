package administracion.sistema;

public class Plataforma {

    public void verificarDesempeno() {
        long tInicio = System.currentTimeMillis();

        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        long tFin = System.currentTimeMillis();
        long tiempoRespuesta = tFin - tInicio;

        if (tiempoRespuesta > 3000) {
            System.err.println("ALERTA DE DESEMPEÑO: Respuesta en " + tiempoRespuesta + "ms (mayor a 3s).");
        } else {
            System.out.println("Desempeño OK: Respuesta en " + tiempoRespuesta + "ms.");
        }
    }
}