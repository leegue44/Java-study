package platice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ��͸�Ȱ����ê�� {
	
	static String recurTap = "";
	public static void recursive(int n) {
		String tap = recurTap;
		
		if(n == 0) {
			System.out.println(tap + "\"����Լ��� ������?\"");
			System.out.println(tap +"\"����Լ��� �ڱ� �ڽ��� ȣ���ϴ� �Լ����\"");
			System.out.println(tap + "��� �亯�Ͽ���.");
			return;
		}
		System.out.println(tap + "\"����Լ��� ������?\"");
		System.out.println(tap + "\"�� ����. �������� �� �� ����⿡ �̼��� ��� ������ ����� ������ �־���.");
		System.out.println(tap + "���� ������� ��� �� ���ο��� ������ ������ �߰�, ��� �����Ӱ� ����� �־���.");
		System.out.println(tap + "���� ���� ��κ� �ǾҴٰ� �ϳ�. �׷��� ��� ��, �� ���ο��� �� ���� ã�ƿͼ� ������.\"");
		

		recurTap += "____";
		recursive(n - 1);
		System.out.println(tap + "��� �亯�Ͽ���.");
	}
	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf =new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(bf.readLine());
		System.out.print("��� �� ��ǻ�Ͱ��а� �л��� ������ �������� ã�ư� ������.");
		System.out.println();
		recursive(n);
	}

}
