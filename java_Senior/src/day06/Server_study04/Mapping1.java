import java.util.HashSet;
import java.util.Set;

/**
 *     <servlet-mapping>
 *         <servlet-name>login</servlet-name>
 *         <url-pattern>/login</url-pattern>
 *         <url-pattern>/g</url-pattern>
 *     </servlet-mapping>
 * @Author: Robin_Wujw
 * @Date: 2022-05-20 15:12
 */
public class Mapping1 {
    private String name;
    private Set<String> patterns;

    public Mapping1() {
        patterns = new HashSet<String>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<String> getPatterns() {
        return patterns;
    }

    public void setPatterns(Set<String> patterns) {
        this.patterns = patterns;
    }
    public void addPattern(String pattern){
        this.patterns.add(pattern);
    }
}
