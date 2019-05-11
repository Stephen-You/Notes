package cn.youric.exception;

import java.lang.reflect.Field;

import sun.misc.Unsafe;
/**
 * -Xmx20M -XX:MaxDirectMemorySize=10M
 * @author YorickYou
 * 2019Äê5ÔÂ6ÈÕ
 * GitHUb£ºhttps://github.com/YorickYou/Notes/tree/master/Java/JVM
 */
public class DirectoryMemoryOOM {
	 private static final int ONE_MB = 1024*1024;
	 private static int count = 1;
	 public static void main(String[] args) {
		 try {
			 Field field = Unsafe.class.getDeclaredField("theUnsafe");
			 field.setAccessible(true);
			 Unsafe unsafe = (Unsafe) field.get(null);
			 while (true) {
				 unsafe.allocateMemory(ONE_MB);
				 count++;
				 }
			 } catch (Exception e) {
		 System.out.println("Exception:instance created "+count);
		 e.printStackTrace();
		 } catch (Error e) {
			 System.out.println("Error:instance created "+count);
			 e.printStackTrace();
			 }
		 }
	 }
