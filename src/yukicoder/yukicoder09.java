package yukicoder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class yukicoder09 {
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
			
			
			
			
			System.out.println(osr(x1,0,0));
			
			
	}
	static long osr(int moku,long ima,long kai){
		long ret = 0;
		
		for(int i=0;i<2;i++){
			ret = ima + i+1;
			if(ret == moku){
				kai++;
				return 0;
			}
			osr(moku,ret,kai);
			
		}
		
		return ret;
	}

}