package cn.yourick.referenceCounting;
/**
 * 引用计数算法很难解决对象间相互引用的问题
 * @author YorickYou
 * 2019年5月7日
 * GitHUb：https://github.com/YorickYou/Notes/tree/master/Java/JVM
 */
public class ReferenceCountingGC {
	public Object instance = null;
	private static final int _1MB = 1024 * 1024;
	/**
	 * 这个成员属性的唯一目的就是占用内存，以便能在GC日志中看清楚是否被回收过
	 */
	private byte[] bigSize = new byte[2 * _1MB];
	
	
	public static void testGC(){
		ReferenceCountingGC objA = new ReferenceCountingGC();
		ReferenceCountingGC objB = new ReferenceCountingGC();
		objA.instance = objB;
		objB.instance = objA;
		
		objA = null;
		objB = null;
		//假设在这里发生GC
		System.gc();
	}
	
	public static void main(String[] args) {
		testGC();
	}
}
