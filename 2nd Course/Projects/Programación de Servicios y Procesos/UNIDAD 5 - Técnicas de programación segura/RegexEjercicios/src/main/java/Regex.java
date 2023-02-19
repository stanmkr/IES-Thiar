/**
 * Created by Stanislav Krastev
 * RegexEjercicios - PACKAGE_NAME
 * Date: Febrero / 2023
 */
public class Regex {

    public static void main(String[] args) {
        System.out.println("Matrícula coche formato 0000XXX ->  "+validarMatriculaCoche("3251KNR"));
        System.out.println("DNI Español 00000000X -> "+validarDNI("56568978P"));
        System.out.println("Número entero positivo -> "+validarEnteroPositivo("543"));
        System.out.println("Número hexadecimal -> "+validarNumeroHexadecimal("#E23124"));
        System.out.println("Número real con X decimales -> "+validarNumeroRealConXDecimales("5.543"));
        System.out.println("Usuario en Twitter. Empieza por @ y puede contener letras mayúsculas y minúsculas, números, guiones y guiones bajos -> "+validarUsuarioTwitter("@hjfg423-432-dsa_"));
        System.out.println("ISBN de 13 dígitos empieza por 978 o 979 -> "+validarISBN("9795648935896"));
    }


    public static boolean validarMatriculaCoche(String matricula){
        return matricula.matches("\\d{4}[A-Z]{3}$");
    }

    public static boolean validarDNI(String dni){
        return dni.matches("^\\d{8}[a-zA-Z]$");
    }

    public static boolean validarEnteroPositivo(String numeroEntero){
        return numeroEntero.matches("[1-9]*$");
    }

    public static boolean validarNumeroHexadecimal(String hexadecimal){
        return hexadecimal.matches("^#[0-9a-fA-F]{6}$");
    }

    public static boolean validarNumeroRealConXDecimales(String numeroReal){
        return numeroReal.matches("^[+-]?\\d+(.\\d{1,})?$");
    }

    public static boolean validarUsuarioTwitter(String usuario){
        return usuario.matches("^@[a-zA-Z0-9_-]+$");
    }

    public static boolean validarISBN(String ISBN){
        return ISBN.matches("^(978|979)\\d{10}$");
    }
}
