package cn.youric.object;

public class FinalizeEscapeGC {
	public static FinalizeEscapeGC SAVE_HOOK = null;
	
	public void isAlive(){
		System.out.println("yes,i am still alive :)");
	}
	
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
		System.out.println("finalize method is executed!");
		FinalizeEscapeGC.SAVE_HOOK = this;
	}
	
	public static void main(String[] args) throws InterruptedException {
		SAVE_HOOK = new FinalizeEscapeGC();
		//�����һ�������Լ�
		SAVE_HOOK = null;
		System.gc();
		//��Ϊfinalize�������ȼ��ܵ�,������ͣ�߳�0.5��ȴ�
		Thread.sleep(500);
		if(SAVE_HOOK != null){
			SAVE_HOOK.isAlive();
		}else {
			System.out.println("no,i am dead :(");
		}
		//����Ĵ���������Ĵ�����ȫ��ͬ,�������ȴ�Ծ�ʧ����
		SAVE_HOOK = null;
		System.gc();
		Thread.sleep(500);
		if(SAVE_HOOK != null){
			SAVE_HOOK.isAlive();
		}else {
			System.out.println("no,i am dead :(");
		}
	}
}
