/**
 *     <servlet>
 *         <servlet-name>login</servlet-name>
 *         <servlet-class>Server_study02.LoginServlet</servlet-class>
 *     </servlet>
 * @Author: Robin_Wujw
 * @Date: 2022-05-20 15:13
 */
public class Entity1 {
    private String name;
    private String clz;

    public Entity1() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClz() {
        return clz;
    }

    public void setClz(String clz) {
        this.clz = clz;
    }
}
