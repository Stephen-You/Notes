package cn.yourick.classloading.process;

public class Test {
	
	static{
		i = 0;	//给变量赋值是可以正常编译通过的
//		System.out.println(i);	//但是这句访问操作，编译器会提示“Cannot reference a field before it is defined”，即非法向前引用
	}
	
	static int i = 1;
	
	static class Parent{
		public static int A = 1;
		
		static{
			A = 2;
		}
	}
	
	static class Sub extends Parent{
		public static int B = A;
	}
	
	/*public static void main(String[] args) {
		System.out.println(Sub.B);
	}*/
	
	static class DeadLoopClass{
		static{
			//如果不加上这个if语句，编译器将提示“Initializer does not complete normally”
			if(true){
				System.out.println(Thread.currentThread() + "init DeadLoopClass");
				while(true){
				}
			}
			
		}
	}
	
	public static void main(String[] args) {
		Runnable script = new Runnable() {
			
			@Override
			public void run() {
				System.out.println(Thread.currentThread() + "start");
				DeadLoopClass deadLoopClass = new DeadLoopClass();
				System.out.println(Thread.currentThread() + "run over");
			}
		};
		Thread thread1 = new Thread(script);
		Thread thread2 = new Thread(script);
		thread1.start();
		thread2.start();
	}
}
