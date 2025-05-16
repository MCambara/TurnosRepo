package preubaMain;


public class Main {
    public static void main(String[] args) {

        /*TurnoDao turnoDao = new TurnoDao();
        TurnoService turnoService = new TurnoService(turnoDao);

        // 1. Crear un nuevo turno
        TurnoModel turno1 = new TurnoModel();
        turno1.setCodigo("A005");
        turno1.setNombreCliente("Juan Perez");
        turno1.setDpiCliente("1234567890123");
        turno1.setTipoServicio("Caja");
        turno1.setEstado("ESPERA");

        turnoService.crearTurno(turno1);
        System.out.println("Turno creado y guardado.");

        // 2. Imprimir todos los turnos después de crear
        System.out.println("\n📋 Lista después de crear:");
        imprimirTodosLosTurnos(turnoService);

        // 3. Actualizar el estado del turno
        turnoService.actualizarEstado(turno1.getId(), "ATENDIDO");
        System.out.println("\n✏️ Turno actualizado (estado = ATENDIDO).");

        // 4. Imprimir todos los turnos después de actualizar
        System.out.println("\n📋 Lista después de actualizar:");
        imprimirTodosLosTurnos(turnoService);

        // 5. Eliminar el turno
        turnoService.eliminarTurno(turno1.getId());
        System.out.println("\n🗑️ Turno eliminado.");

        // 6. Imprimir todos los turnos después de eliminar
        System.out.println("\n📋 Lista después de eliminar:");
        imprimirTodosLosTurnos(turnoService);
    }

    // Método para imprimir todos los turnos
    public static void imprimirTodosLosTurnos(TurnoService turnoService) {
        List<TurnoModel> turnos = turnoService.obtenerTodosLosTurnos();
        if (turnos.isEmpty()) {
            System.out.println("No hay turnos registrados.");
            return;
        }

        for (TurnoModel turno : turnos) {
            System.out.println("----------------------------------------");
            System.out.println("ID: " + turno.getId());
            System.out.println("Código: " + turno.getCodigo());
            System.out.println("Nombre Cliente: " + turno.getNombreCliente());
            System.out.println("DPI Cliente: " + turno.getDpiCliente());
            System.out.println("Tipo Servicio: " + turno.getTipoServicio());
            System.out.println("Estado: " + turno.getEstado());
            System.out.println("Fecha de Creación: " + turno.getFechaCreacion());
            System.out.println("----------------------------------------");
        }*/
    }
}
