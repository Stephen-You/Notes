package cn.yourick.classloading.opportunity;
/**
 * 
 * @author YorickYou
 * 2019年4月29日
 * GitHUb：https://github.com/YorickYou/Notes/tree/master/Java/JVM
 * 被动使用类字段演示三：
 * 	常量在编译阶段会存入调用类的常量池中，本质上并没有直接引用到定义常量的类，一次不会触发定义常量的类的初始化
 */
public class ConstClass {
	static{
		System.out.println("ConstClass init!");
	}
	
	public static final String HELLOWORLD = "hello world";
}
