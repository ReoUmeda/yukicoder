package yukicoder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class yukicoder02 {
	public static void main(String[] args){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tes = null;
		char[] peso = {48,48,48,48,48,48,48,48,48,48};
		//sysgoer(peso);
		System.out.println(peso);
		
		try {
			tes = br.readLine();
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		
		if(tes.equals("10 unlocked")){
			try {
				br.close();
			} catch (IOException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}
			System.exit(0);
		}
		
		String[] tew = tes.split(" ");
		
		int i = 0;
		String tmp = null;
		int hai = 0;
		int kazu =Integer.parseInt(tew[0]);
		int kazu2 = kazu;
		
		while(true){
			peso[hai]++;
			
			
			System.out.println(peso);
			
			try {
				tes = br.readLine();
			} catch (IOException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}
			if(tes.equals("10 unlocked")){
				try {
					br.close();
				} catch (IOException e) {
					// TODO 自動生成された catch ブロック
					e.printStackTrace();
				}
				System.exit(0);
			}
			
			tew = tes.split(" ");
			kazu =Integer.parseInt(tew[0]);
			if(kazu < kazu2){
				peso[hai]--;
				hai++;
			}else if(kazu > kazu2){
				hai++;
				kazu2 = kazu;
			}
			
		}
		
	}
//	public static void sysgoer(char[] peso){
//		for(int i=0;i < 10;i++){
//			System.out.print(peso[i]);
//		}
//		System.out.println();
//		
//	}

}