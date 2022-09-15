import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;
import java.util.List;

/* 处理器
 * @Author Robin_Wu
 * @Description
 * @Date 22:51 2022/6/8
 * @Param
 * @return
 **/
public class WebHandler1 extends DefaultHandler{
    private List<Entity1> entities;
    private List<Mapping1> mappings;
    private Entity1 entity;
    private Mapping1 mapping;
    private String tag;//存储操作的标签 (因为characters 里面没有qname)
    private boolean isMapping = false;

    @Override
    public void startDocument() throws SAXException {
        entities = new ArrayList<Entity1>();
        mappings = new ArrayList<Mapping1>();
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        if(null!=qName){
            tag = qName;//存储标签名
            if(tag.equals("servlet")){
                entity = new Entity1();
                isMapping = false;
            }else if(tag.equals("servlet-mapping")){
                mapping = new Mapping1();
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

    public List<Mapping1> getMappings() {
        return mappings;
    }

}