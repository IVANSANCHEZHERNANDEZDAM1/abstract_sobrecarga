package sobrecarga_abstract1;

public class Main {

	public static void main(String[] args) {
		 CorreoElectronico correo = new CorreoElectronico("Hola", "usuario@linkia.com", "Un saludo brother");
	        correo.enviar();

	        SMS sms = new SMS("Hola", "123456789", 160);
	        sms.enviar();

	        NotificacionApp appNotif = new NotificacionApp("Hola", "Usuario", "ID123");
	        appNotif.enviar();
	    }

}
