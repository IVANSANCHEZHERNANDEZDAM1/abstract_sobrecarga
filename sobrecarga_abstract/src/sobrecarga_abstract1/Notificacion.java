package sobrecarga_abstract1;

abstract class Notificacion {
    String mensaje;
    String destinatario;

    public Notificacion(String mensaje, String destinatario) {
        this.mensaje = mensaje;
        this.destinatario = destinatario;
    }

    abstract void enviar();
}
