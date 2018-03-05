package backjoon;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class kakao_new {

	public static void main(String[] args) {
		String str1, str2;
		Map str1Map = new HashMap<String, Integer>(); // key : string, value : string ��Ÿ�� ����
		Map str2Map = new HashMap<String, Integer>();
		HashSet str1Set = new HashSet<String>(); // �ߺ�����
		HashSet str2Set = new HashSet<String>();
		Scanner scan = new Scanner(System.in);
		int MAX = 0;
		int MIN = 0;

		str1 = scan.nextLine();
		str2 = scan.nextLine();

		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		int max = Math.max(str1.length(), str2.length());
		for (int i = 0; i < str1.length()-1; i++) { //str1�� ���ؼ� map�� set�� �־��ش�.

				if (!(str1.charAt(i) >= 'a' && str1.charAt(i) <= 'z')
						|| !(str1.charAt(i + 1) >= 'a' && str1.charAt(i + 1) <= 'z')) // ���ĺ��� �ƴϸ�
					continue;

				String tmp = "";
				tmp += str1.charAt(i);
				tmp += str1.charAt(i + 1);


				if(str1Map.containsKey(tmp)) {
					Integer cnt = (Integer) str1Map.get(tmp);
					str1Map.put(tmp, cnt+1);
				} else
					str1Map.put(tmp, 1); // Map�� �ֱ�
				
				str1Set.add(tmp);
				
			}
		
		for (int i = 0; i < str2.length()-1; i++) {
				if (!(str2.charAt(i) >= 'a' && str2.charAt(i) <= 'z')
						|| !(str2.charAt(i + 1) >= 'a' && str2.charAt(i + 1) <= 'z')) // ���ĺ��� �ƴϸ�
					continue;

				String tmp = "";
				tmp += str2.charAt(i);
				tmp += str2.charAt(i + 1);


				if(str2Map.containsKey(tmp)) {
					Integer cnt = (Integer) str2Map.get(tmp);
					str2Map.put(tmp, cnt+1);
				} else
					str2Map.put(tmp, 1); // Map�� �ֱ�
				
				str2Set.add(tmp);

		}
		
		Iterator<String> itr1 = str1Set.iterator();
		Iterator<String> itr2 = str2Set.iterator();
		
		while(itr1.hasNext()) { // �ߺ� �ľ�
			String e = itr1.next();
			if(str1Map.containsKey(e) && (int)str1Map.get(e)!=-1 && str2Map.containsKey(e) && (int)str2Map.get(e)!=-1) {
				MAX+=Math.max((int)str1Map.get(e), (int)str2Map.get(e));
				MIN+=Math.min((int)str1Map.get(e), (int)str2Map.get(e));
				str1Map.put(e, -1);
				str2Map.put(e, -1);
			}
		}
		itr1 = str1Set.iterator();
		while(itr1.hasNext()) { // �ߺ� ���ܵ� �������� �����տ� �߰�
			String e = itr1.next();
			if((int)str1Map.get(e)!=-1) {
				MAX+=(int)str1Map.get(e);
				str1Map.put(e, -1);
			}
		}
		
		while(itr2.hasNext()) { // �ߺ� ���ܵ� �������� �����տ� �߰�
			String e = itr2.next();
			if((int)str2Map.get(e)!=-1) {
				MAX+=(int)str2Map.get(e);
				str2Map.put(e, -1);
			}
		}

		double result = 0;
		if(MAX==0)
			result = 1;
		else
			result = (double)MIN/(double)MAX;
		System.out.println((int)(result*65536));

	}

}
