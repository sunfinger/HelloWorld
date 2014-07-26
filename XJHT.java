import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.Scanner;

import javax.swing.JFrame;


public class XJHT {
	public static void main(String agrs[]){
		Map<String, Charset> charsets = Charset.availableCharsets();
		for(String n : charsets.keySet()){
			System.out.println(n);
		}
	}
}
