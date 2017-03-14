package yukicoder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class yukicoder012 {
	public static void main(String[] args){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tes = null;

			try {
				tes = br.readLine();
			} catch (IOException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}
			BigDecimal one = new BigDecimal("0.00");
			BigDecimal two = null;
			one.setScale(11,BigDecimal.ROUND_FLOOR);
			long r = Long.parseLong(tes);
			double d = 0d;
			double tmp = 0d;
			for(int i=0;i<r;i++){
				
				try {
					tes = br.readLine();
				} catch (IOException e) {
					// TODO 自動生成された catch ブロック
					e.printStackTrace();
				}
				//tmp = Double.parseDouble(tes);
				two = new BigDecimal(tes);
				//d = tmp + d;
				one = one.add(two);
				//System.out.println(one.doubleValue());
			}
			d = one.doubleValue();
			String s = String.format("%.10f",d);
			System.out.println(s);
			
	}

}