package cn.youric.exception;

import java.util.ArrayList;
import java.util.List;
// -XX:MetaspaceSize=10M  -XX:MaxMetaspaceSize=10M
public class RuntimeConstantPoolOOM {
	public static void main(String[] args) {
		//ʹ��List�����ų��������ã�����Full GC���ճ�������Ϊ
		List<String> list = new ArrayList<>();
		//10MB��PermSize��integer��Χ���㹻����OOM��
		int i = 0;
		while (true) {
			list.add(String.valueOf(i++).intern());
		}
	}
}