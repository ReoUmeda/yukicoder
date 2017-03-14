package yukicoder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class yukicoder014 {
	public static void main(String[] args){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tes = null;
		
		try {
			tes = br.readLine();
			} catch (IOException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
		}
		
		
		
		char[] tmpq = tes.toCharArray();
		
		char[] tmps = tes.toCharArray();
		char jie = 0;
		for(int i=0;i<tmps.length;i++){
			for(int j=0;j<tmps.length;j++){
				if(tmps[i]  > tmps[j]){
					jie = tmps[i];
					tmps[i] = tmps[j];
					tmps[j] = jie;
				}
			}
		}
		
		int rrr = 0;
		String asdf = "";
		String as = "";
		for(int i= 0;i<tmps.length;i++){
			if(rrr != 1 &&tmpq[i] != tmps[i]){
				rrr = 1;
			}
			if(rrr == 1){
				asdf = asdf + tmpq[i];
			}else{
				as = as + tmpq[i];
			}
		}
		
		char[] tmp = asdf.toCharArray();
		
		char s = '1';
		int num = -1;
		
		for(int i = 0;i<tmp.length;i++){
			if(tmp[i] >= s){
				s = tmp[i];
				num = i;
			}
		}
		char aaa = 0;
		
		
		for(int i = 0;i<tmp.length;i++){
			if(num == 0){
				break;
			}
			if(tmp[i] < s){
				aaa = tmp[i];
				
				tmp[i] = s;
				
				tmp[num] = aaa;
				
				
				break;
			}
		}
		
		
		
		
		
		System.out.println(as+String.copyValueOf(tmp));
		
		
		
	}

}