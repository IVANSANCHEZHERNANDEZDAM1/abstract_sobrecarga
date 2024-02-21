package sobrecarga_abstract1;

class NotificacionApp extends Notificacion {
    String idDispositivo;

    public NotificacionApp(String mensaje, String destinatario, String idDispositivo) {
        super(mensaje, destinatario);
        this.idDispositivo = idDispositivo;
    }

    @Override
    void enviar() {
        System.out.println("Enviando notificación en la aplicación al dispositivo " + idDispositivo);
        System.out.println("Mensaje: " + mensaje);
    }
}
