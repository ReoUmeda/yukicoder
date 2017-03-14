package yukicoder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class yukicoder03 {
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
		int x = Integer.parseInt(tew[0]),y = Integer.parseInt(tew[1]);
		int[][] peso = new int[x+1][y+1];
		
		for(int i=0;i<y;i++){
			try {
				tes = br.readLine();
			} catch (IOException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}
			tew = tes.split(" ");
			for(int j=0;j<x;j++){
				peso[j][i] = Integer.parseInt(tew[j]);
			}
		}

		
		int i = 0;
		String tmp = null;
		int hai = 0;
		int kazu =Integer.parseInt(tew[0]);
		int kazu2 = kazu;
		
		while(true){
			
			
			//System.out.println(peso);
			
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
				peso[hai][0]--;
				hai++;
			}else if(kazu > kazu2){
				hai++;
				kazu2 = kazu;
			}
			
		}
		
	}
	public static void sysgoer(int[][] peso){
		for(int i=0;i<peso[0].length;i++){
			for(int j=0;j<peso.length;j++){
				System.out.print(peso[j][i]+" ");
			}
			System.out.println();
		}
	}

}