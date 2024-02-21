package sobrecarga_abstract1;

class CorreoElectronico extends Notificacion {
    String asunto;

    public CorreoElectronico(String mensaje, String destinatario, String asunto) {
        super(mensaje, destinatario);
        this.asunto = asunto;
    }

    @Override
    void enviar() {
        System.out.println("Enviando correo electrónico a " + destinatario + " con asunto: " + asunto);
        System.out.println("Mensaje: " + mensaje);
    }}
