package cn.youric.methodArea;

import java.io.File;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.List;

public class OOMTest {   

	public static void main(String[] args) {
        URL url = null;
        List classLoaderList = new ArrayList();
        try {
            url = new File("/tmp").toURI().toURL();
            URL[] urls = {url};
            while (true){
                ClassLoader loader = new URLClassLoader(urls);
                classLoaderList.add(loader);
                loader.loadClass("cn.metaspace.error.ClassA");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}  
