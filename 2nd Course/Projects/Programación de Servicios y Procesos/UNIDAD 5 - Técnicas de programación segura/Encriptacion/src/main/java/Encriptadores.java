import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;
import javax.swing.*;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Base64;

/**
 * AUTOR:Stanislav Krastev
 * PROYECTO: Encriptacion
 * FECHA: Febrero / 2023
 */
public class Encriptadores {


    private SecretKeySpec generarClave(String clave, String algoritmo) throws NoSuchAlgorithmException {
        byte[] claveEncriptacion = clave.getBytes(StandardCharsets.UTF_8);

        MessageDigest sha = MessageDigest.getInstance("SHA-1");

        claveEncriptacion = sha.digest(claveEncriptacion);
        claveEncriptacion = Arrays.copyOf(claveEncriptacion, 16);

        SecretKeySpec secretKey = new SecretKeySpec(claveEncriptacion, "AES");

        return secretKey;
    }


    public String encriptar(String datos, String claveSecreta, String algoritmo) throws UnsupportedEncodingException, NoSuchAlgorithmException, InvalidKeyException, NoSuchPaddingException, IllegalBlockSizeException, BadPaddingException {
        SecretKeySpec secretKey = this.generarClave(claveSecreta, algoritmo);

        Cipher cipher = Cipher.getInstance(algoritmo+"/PKCS5Padding");
        cipher.init(Cipher.ENCRYPT_MODE, secretKey);

        byte[] datosEncriptar = datos.getBytes(StandardCharsets.UTF_8);
        byte[] bytesEncriptados = cipher.doFinal(datosEncriptar);
        String encriptado = Base64.getEncoder().encodeToString(bytesEncriptados);

        return encriptado;
    }


    public String desencriptar(String datosEncriptados, String claveSecreta,String algoritmo) throws UnsupportedEncodingException, NoSuchAlgorithmException, InvalidKeyException, NoSuchPaddingException, IllegalBlockSizeException, BadPaddingException {
        SecretKeySpec secretKey = this.generarClave(claveSecreta, algoritmo);

        Cipher cipher = Cipher.getInstance(algoritmo + "/PKCS5PADDING");
        cipher.init(Cipher.DECRYPT_MODE, secretKey);

        String datos = null;
        try {
            byte[] bytesEncriptados = Base64.getDecoder().decode(datosEncriptados);
            byte[] datosDesencriptados = cipher.doFinal(bytesEncriptados);
            datos = new String(datosDesencriptados);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error entre clave y hashcode", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return datos;
    }
}
