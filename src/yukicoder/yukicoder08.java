package yukicoder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class yukicoder08 {
	public static void main(String[] args){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tes = null;
		
			try {
				tes = br.readLine();
			} catch (IOException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}
			int x1 = (int)Long.parseLong(tes);
			int[] m = new int[x1];
			int[] t = new int[x1];
			int[] m2 = new int[x1];
			try {
				tes = br.readLine();
			} catch (IOException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}
			
			String[] sprit = tes.split(" ");
			for(int i=0;i<sprit.length;i++){
				m[i] = Integer.parseInt(sprit[i]);
				m2[i] = 0;
			}
			
			try {
				tes = br.readLine();
			} catch (IOException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}
			
			sprit = tes.split(" ");
			for(int i=0;i<sprit.length;i++){
				t[i] = Integer.parseInt(sprit[i]);
			}
			int sr = sprit.length;
			int bbb = 0;
			for(int i=0;i<sr;i++){
				
				
				for(int j=0;j<0;)
				
				
				
				bbb++;
				bbb = bbb%sr;
			}
			
			
			
			System.out.println(100L/x1);
			
			
	}

}