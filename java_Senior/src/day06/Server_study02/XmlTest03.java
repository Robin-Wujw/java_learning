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
public class XmlTest03 {

    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //SAX解析
        //1.获取解析工厂
        SAXParserFactory factory = SAXParserFactory.newInstance();
        //2.从解析工厂获取解析器
        SAXParser parse = factory.newSAXParser();
        //3.编写处理器
        //4.加载文档Document注册处理器
        WebHandler handler = new WebHandler();
        //5.解析
        parse.parse(Thread.currentThread().getContextClassLoader()
                .getResourceAsStream("web.xml"),handler);
        //获取数据
        WebContext context = new WebContext(handler.getEntities(),handler.getMappings());

        //假设你输入了 /login
        String className = context.getClz("/reg");
        Class clz = Class.forName(className);
        Servlet servlet = (Servlet)clz.getConstructor().newInstance();
        System.out.println(servlet);
        servlet.service();
    }
}
class WebHandler extends DefaultHandler{
    private List<Entity1> entities;
    private List<Mapping> mappings;
    private Entity1 entity;
    private Mapping mapping;
    private String tag;//存储操作的标签 (因为characters 里面没有qname)
    private boolean isMapping = false;

    @Override
    public void startDocument() throws SAXException {
        entities = new ArrayList<Entity1>();
        mappings = new ArrayList<Mapping>();
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        if(null!=qName){
            tag = qName;//存储标签名
            if(tag.equals("servlet")){
                entity = new Entity1();
                isMapping = false;
            }else if(tag.equals("servlet-mapping")){
                mapping = new Mapping();
                isMapping = true;
            }
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        if(null!=qName) {
            if(qName.equals("servlet")){
                entities.add(entity);
            }else if(qName.equals("servlet-mapping")){
                mappings.add(mapping);
            }
        }
        tag = null;//tag丢弃
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        String contents = new String(ch, start, length).trim();
        if(null!=tag){//处理了空的问题
        if(isMapping){//操作servlet-mapping
            if (tag.equals("servlet-name")){
                mapping.setName(contents);
            }else if(tag.equals("url-pattern")){
                mapping.addPattern(contents);
            }
        }else{//操作servlet
            if (tag.equals("servlet-name")){
                entity.setName(contents);
            }else if(tag.equals("servlet-class")){
                entity.setClz(contents);
            }
        }

        }
    }

    public List<Entity1> getEntities() {
        return entities;
    }

    public List<Mapping> getMappings() {
        return mappings;
    }

}