import java.util.Date;
import java.util.Objects;

/**
 * @Author: Robin_Wujw
 * @Date: 2022-04-14 19:55
 */
public class Student {
    private int id;
    private String name;
    private Date birthday;
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
