package cn.yourick.classloading.opportunity;
/**
 * 
 * @author YorickYou
 * 2019��4��29��
 * GitHUb��https://github.com/YorickYou/Notes/tree/master/Java/JVM
 * ����ʹ�����ֶ���ʾ����
 * 	�����ڱ���׶λ���������ĳ������У������ϲ�û��ֱ�����õ����峣�����࣬һ�β��ᴥ�����峣������ĳ�ʼ��
 */
public class ConstClass {
	static{
		System.out.println("ConstClass init!");
	}
	
	public static final String HELLOWORLD = "hello world";
}
