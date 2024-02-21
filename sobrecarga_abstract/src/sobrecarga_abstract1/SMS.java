package sobrecarga_abstract1;

	class SMS extends Notificacion {
	    int limiteCaracteres;

	    public SMS(String mensaje, String destinatario, int limiteCaracteres) {
	        super(mensaje, destinatario);
	        this.limiteCaracteres = limiteCaracteres;
	    }

	    @Override
	    void enviar() {
	        System.out.println("Enviando SMS a " + destinatario);
	        System.out.println("Mensaje: " + mensaje);
	    }
}
