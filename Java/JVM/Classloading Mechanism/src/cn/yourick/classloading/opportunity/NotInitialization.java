package cn.yourick.classloading.opportunity;
/**
 * 
 * @author YorickYou
 * 2019��4��29��
 * GitHUb��https://github.com/YorickYou/Notes/tree/master/Java/JVM
 * ����ʹ�����ֶ���ʾ1��
 * 	ͨ���������ø���ľ�̬�ֶΣ����ᵼ�������ʼ��
 */
public class NotInitialization {
	/*public static void main(String[] args) {
		System.out.println(SunClass.value);
	}*/
	/*public static void main(String[] args) {
		SuperClass[] sca = new SuperClass[10];
	}*/
//	final int a;
//	public static int b;
	public static void main(String[] args) {
		System.out.println(ConstClass.HELLOWORLD);
	}
}
