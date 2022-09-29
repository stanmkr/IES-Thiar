package pspT1;

public class Ej1_LanzadorProcesos {

	public void ejecutar (String ruta) {
		ProcessBuilder pb;
		try {
			pb=new ProcessBuilder(ruta);
			Process p=pb.start();
		}
		catch (Exception e){
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		String ruta="C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe";
		Ej1_LanzadorProcesos lp=new Ej1_LanzadorProcesos();
		lp.ejecutar(ruta);
		System.out.println("Finalizado");
	}
}
