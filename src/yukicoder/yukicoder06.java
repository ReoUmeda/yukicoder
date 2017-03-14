package yukicoder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class yukicoder06 {
	public static void main(String[] args){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tes = null;
		
			try {
				tes = br.readLine();
			} catch (IOException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}
			
			String[] tew = tes.split(" ");
			long x1 = Long.parseLong(tew[0]);
			long x2 = Long.parseLong(tew[1]);
			long x3 = Long.parseLong(tew[2]);
			
			x1 = Math.abs(x1);
			x2 = Math.abs(x2);
			x3 = Math.abs(x3);
			
			
			System.out.println((long)(((x1+x2)+2d*x3*Math.sin(Math.toRadians(45d))+1)));
			
			
	}

}