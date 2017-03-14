package yukicoder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class yukicoder04 {
	public static void main(String[] args){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tes = null;
		
		

		
		

			try {
				tes = br.readLine();
			} catch (IOException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}
			
			String[] tew = null;
			tew = tes.split("\\.");

			int x = Integer.parseInt(tew[0])
					,y = Integer.parseInt(tew[1])
					,z = Integer.parseInt(tew[2]);
			
			try {
				tes = br.readLine();
			} catch (IOException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}
			
			tew = tes.split("\\.");
			int x2 = Integer.parseInt(tew[0]),y2 = Integer.parseInt(tew[1]),z2 = Integer.parseInt(tew[2]);
			if(x < x2){
				System.out.println("NO");
			}else if(x > x2){
				System.out.println("YES");
			}else if(y < y2){
				System.out.println("NO");
			}else if(y > y2){
				System.out.println("YES");
			}else if(z < z2){
				System.out.println("NO");
			}else if(z > z2){
				System.out.println("YES");
			}else{
				System.out.println("YES");
			}
			
		
	}

}