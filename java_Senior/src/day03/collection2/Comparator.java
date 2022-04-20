/**
 * 接口中泛型字母只能使用在方法中，不能使用在全局常量中
 * @Author: Robin_Wujw
 * @Date: 2022-04-16 20:54
 */
public interface Comparator<T> {

    void compare(T t);
}
