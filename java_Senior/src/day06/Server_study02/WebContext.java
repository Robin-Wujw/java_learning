import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: Robin_Wujw
 * @Date: 2022-05-20 18:37
 */
public class WebContext {
    private List<Entity1> entities = null;
    private List<Mapping> mappings = null;

    //key--->servlet-name  value--->servlet-class
    private Map<String,String> entityMap = new HashMap<String,String>();
    //key--->url-pattern   value--->servlet-name
    private Map<String,String> mappingMap = new HashMap<String,String>();
    public WebContext(List<Entity1> entities, List<Mapping> mappings) {
        this.entities = entities;
        this.mappings = mappings;
        //将entity的List转成对应的map
        for(Entity1 entity: entities){
            entityMap.put(entity.getName(),entity.getClz());
        }
        //将map的List转成对应的map
        for(Mapping mapping: mappings){
            for(String pattern: mapping.getPatterns()) {
                mappingMap.put(pattern, mapping.getName());
            }
        }
    }

    /*
    通过URL的路径找到了对应的class
     */
    public String getClz(String pattern){
        String name = mappingMap.get(pattern);
        return entityMap.get(name);
    }
}
