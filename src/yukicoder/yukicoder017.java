package yukicoder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class yukicoder017 {
	public static void main(String[] args){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tes = null;
		
		try {
			tes = br.readLine();
			} catch (IOException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
		}
		
		
		int a = Integer.parseInt(tes);
		try {
			tes = br.readLine();
			} catch (IOException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
		}
		
		
		int b = Integer.parseInt(tes);
		
		try {
			tes = br.readLine();
			} catch (IOException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
		}
		
		
		int c = Integer.parseInt(tes);
		
		int max = a;
		
		int bcount=0,ccount=0;
		
		while(max>0){
			max = max - b;
			bcount++;
		}
		
		max = a;
		
		while(max>0){
			max = max - c;
			ccount++;
		}
		
		if(((bcount*2)/3) >= ccount){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
		
	}

}
