package cn.yourick.classloader;

import java.io.IOException;
import java.io.InputStream;

public class ClassLoaderTest {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		ClassLoader classLoader = new ClassLoader() {
			@Override
			public Class<?> loadClass(String name) throws ClassNotFoundException {
				
				try {
					String filename = name.substring(name.lastIndexOf(".")+1) + ".class";
					System.out.println(filename);
					//getClass() ���ش�Object������ʱ��
					InputStream is = getClass().getResourceAsStream(filename);
					if(is == null){
						return super.loadClass(name);
					}
					//available()���شӸ��������п��Զ�ȡ�������������ֽ����Ĺ���ֵ�������ᱻ��һ�ε��ô��������ķ���������
					byte[] b = new byte[is.available()];
					//����������ȡһЩ�ֽ������������Ǵ洢�������� b ��
					is.read(b);
					//defineClass(name, b, 0, b.length); ���ֽ�����ת��Ϊ��� ���ʵ��
					return defineClass(name, b, 0, b.length);
				} catch (IOException e) {
					throw new ClassNotFoundException();
				}
			}
		};
		//loadClass(String name)   ��ָ����binary name ���ؿγ� �� 
		Object obj = classLoader.loadClass("cn.yourick.classloader.ClassLoaderTest").newInstance();
		System.out.println(obj.getClass());
		System.out.println(obj instanceof cn.yourick.classloader.ClassLoaderTest);
	}
	
}