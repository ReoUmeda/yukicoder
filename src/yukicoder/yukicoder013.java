package yukicoder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class yukicoder013 {
	public static void main(String[] args){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tes = null;

			try {
				tes = br.readLine();
			} catch (IOException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}
			
			String[] sp = tes.split(" ");
			
			int z = Integer.parseInt(sp[0]);
			int y = Integer.parseInt(sp[1]);
			BigDecimal aa = new BigDecimal(z);
			BigDecimal bb = new BigDecimal(0);
			
			long[] a = new long[y]; 
			long b = 0L;
			long c = 1L;
			long e = 1L;
			
			try {
				tes = br.readLine();
			} catch (IOException e1) {
				// TODO 自動生成された catch ブロック
				e1.printStackTrace();
			}
			
			sp = tes.split(" ");
			int x = 0;
			for(int i=0;i<y;i++){
//				e = z;
//				c = z;
//				x = Integer.parseInt(sp[i]);
//				if(x == 0){
//					b++;
//					continue;
//				}
//				x--;
//				for(int j=0;j<x;j++){
//					c = e*c;
//					System.out.println(c);
//				}
//				b = b + c;
				aa = new BigDecimal(z);
				aa = aa.pow(Integer.parseInt(sp[i]));
				
				bb = bb.add(aa);
				System.out.println(aa.longValueExact());
				
			}
			
			bb.remainder(new BigDecimal(1000003));
			
			System.out.println(bb.longValue());
			
	}

}