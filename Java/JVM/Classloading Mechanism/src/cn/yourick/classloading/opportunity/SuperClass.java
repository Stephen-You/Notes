package cn.yourick.classloading.opportunity;
/**
 * 
 * @author YorickYou
 * 2019��4��29��
 * GitHUb��https://github.com/YorickYou/Notes/tree/master/Java/JVM
 */
public class SuperClass {
	static{
		System.out.println("SuperClass init!");
	}
	public static int value = 123;
}
