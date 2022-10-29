import java.util.Random;
import java.util.Scanner;
import java.util.Base64;

public class ShitNitroGen {
	
	public static final String a = "https://discord.gift/";
	public static String ab = null;
	
	protected static String b() {
        String ca = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder cb = new StringBuilder();
        Random r = new Random();
        while (cb.length() < 12) {
            int x = (int) (r.nextFloat() * ca.length());
            cb.append(ca.charAt(x));
        }
        String cc = cb.toString();
        return cc;

    }
	
	public static void main(String [] args) {
		String ac[] = new String[128];
		
		for (int er = 0; er < 128; er++) {
			ab = b();
			byte[] ba = Base64.getEncoder().encode(ab.getBytes());
			ac[er] = new String(ba);
			if (ac[er].length() < 16) {
				ac[er] = "BADLINK";
			}
			System.out.println("new link: " + a + ac[er]);
		}
		
		System.out.println("done generating the links");
	}
}