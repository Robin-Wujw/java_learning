package DynamicCompile;

import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;
import java.io.*;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;

/**
 * @Author: Robin_Wujw
 * @Date: 2022-07-08 11:48
 */
public class Demo01 {
    public static void main(String[] args) {
        //通过IO流操作，将字符串存储成一个临时文件(Hi.java)，然后调用动态编译方法
        String str = "public class Hi {public static void main(String[] args){System.out.println(\"hahaha\");}}";
        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        int result = compiler.run(null,null,null,"D:\\My_work\\My_Code\\Myjava\\HelloWorld.java");
        System.out.println(result==0?"编译成功":"编译失败");


        //通过 Runtime调用执行类
//     Runtime run = Runtime.getRuntime();
//        try {
//            Process process = run.exec("java -cp D:\\My_work\\My_Code\\Myjava HelloWorld.java");
//            InputStream in =  process.getInputStream();
//            BufferedReader reader = new BufferedReader(new InputStreamReader(in));
//            String info = "";
//            while((info=reader.readLine())!=null){
//                System.out.println(info);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        try{
            URL[] urls = new URL[] {new URL("file:/"+"D:\\\\My_work\\\\My_Code\\\\Myjava HelloWorld.java")};
            URLClassLoader loader = new URLClassLoader(urls);
            Class c = loader.loadClass("HelloWorld");
            //调用加载类的main方法
            Method m = c.getMethod("main",String[].class);
            m.invoke(null,(Object)new String[]{"aa","bb"});
            //由于可变参数是JDK5.0之后才有，如果不加 (Object)
            // 就相当于编译 m.invoke(null,"aa","bb"); 参数不匹配
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
