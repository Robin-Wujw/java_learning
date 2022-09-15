import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

/**
 * 熟悉SAX解析流程
 * @Author: Robin_Wujw
 * @Date: 2022-05-19 16:22
 */
public class XmlTest031 {

    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //SAX解析
        //1.获取解析工厂
        SAXParserFactory factory = SAXParserFactory.newInstance();
        //2.从解析工厂获取解析器
        SAXParser parse = factory.newSAXParser();
        //3.编写处理器
        //4.加载文档Document注册处理器
        WebHandler1 handler = new WebHandler1();
        //5.解析
        parse.parse(Thread.currentThread().getContextClassLoader()
                .getResourceAsStream("web.xml"),handler);
        //获取数据
        WebContext1 context = new WebContext1(handler.getEntities(),handler.getMappings());

        //假设你输入了 /login
        String className = context.getClz("/reg");
        Class clz = Class.forName(className);
        Servlet servlet = (Servlet)clz.getConstructor().newInstance();
        System.out.println(servlet);
        servlet.service();
    }
}
