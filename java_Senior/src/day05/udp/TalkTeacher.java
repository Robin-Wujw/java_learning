/**
 * 加入多线程 实现双向交流 模拟在线咨询
 * @Author: Robin_Wujw
 * @Date: 2022-04-27 19:15
 */
public class TalkTeacher {
    public static void main(String[] args) {
        new Thread(new TalkReceive(9999,"学生")).start();//接收
        new Thread(new TalkSend(5555,"localhost",8888)).start();//发送
    }
}
