package cn.yourick.referenceCounting;
/**
 * ���ü����㷨���ѽ��������໥���õ�����
 * @author YorickYou
 * 2019��5��7��
 * GitHUb��https://github.com/YorickYou/Notes/tree/master/Java/JVM
 */
public class ReferenceCountingGC {
	public Object instance = null;
	private static final int _1MB = 1024 * 1024;
	/**
	 * �����Ա���Ե�ΨһĿ�ľ���ռ���ڴ棬�Ա�����GC��־�п�����Ƿ񱻻��չ�
	 */
	private byte[] bigSize = new byte[2 * _1MB];
	
	
	public static void testGC(){
		ReferenceCountingGC objA = new ReferenceCountingGC();
		ReferenceCountingGC objB = new ReferenceCountingGC();
		objA.instance = objB;
		objB.instance = objA;
		
		objA = null;
		objB = null;
		//���������﷢��GC
		System.gc();
	}
	
	public static void main(String[] args) {
		testGC();
	}
}
