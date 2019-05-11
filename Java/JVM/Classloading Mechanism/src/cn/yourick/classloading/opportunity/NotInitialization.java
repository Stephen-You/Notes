package cn.yourick.classloading.opportunity;
/**
 * 
 * @author YorickYou
 * 2019年4月29日
 * GitHUb：https://github.com/YorickYou/Notes/tree/master/Java/JVM
 * 被动使用类字段演示1：
 * 	通过子类引用父类的静态字段，不会导致子类初始化
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
