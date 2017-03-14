package yukicoder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class yukicoder01 {
	public static void main(String[] args){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tes = null;
		
		System.out.println("000");
		
		
		try {
			tes = br.readLine();
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		
		if(tes.equals("unlocked")){
			System.exit(0);
		}
		
		int i = 0;
		String tmp;
		
		while(true){
			
			if(i < 10){
				tmp = "00"+String.valueOf(i);
			}else if(i < 100){
				tmp = "0"+String.valueOf(i);
			}else{
				tmp = String.valueOf(i);
			}
			
			System.out.println(tmp);
			
			try {
				tes = br.readLine();
			} catch (IOException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}
			if(tes.equals("unlocked")){
				System.exit(0);
			}
			
			i++;
		}
		
	}

}