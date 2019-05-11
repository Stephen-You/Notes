package cn.youric.exception;

import java.util.ArrayList;
import java.util.List;
/**
 * -Xms20m -Xmx20m -XX:+HeapDumpOnOutOfMemoryError
 * @author YorickYou
 * 2019年5月6日
 * GitHUb：https://github.com/YorickYou/Notes/tree/master/Java/JVM
 */
public class HeapOutOfMemory {
	public static void main(String[] args) {
		List<TestCase> cases = new ArrayList<TestCase>();
		while(true){
			cases.add(new TestCase());
		}
	}
}
