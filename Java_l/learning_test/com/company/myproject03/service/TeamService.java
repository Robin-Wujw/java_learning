package com.company.myproject03.service;

import com.company.myproject03.domain.Architect;
import com.company.myproject03.domain.Designer;
import com.company.myproject03.domain.Employee;
import com.company.myproject03.domain.Programmer;

/**
 * 关于开发团队成员的管理、添加、删除等
 * @Author: Robin_Wujw
 * @Date: 2022/3/21 21:10
 */
public class TeamService {
    private static int counter = 1;//给memberId赋值使用
    private int MAX_MEMBER = 5;//限制开发团队的人数
    private Programmer[] team = new Programmer[MAX_MEMBER];//保存开发团队成员
    private int total;//记录开发团队中实际人数

    public TeamService() {
        super();
    }

    /*
     * @Author Robin_Wu
     * @Description 获取开发团队的所有成员
     * @Date 21:17 2022/3/21
     * @Param []
     * @return com.company.myproject03.domain.Programmer[]
     **/
    public Programmer[] getTeam(){
        Programmer[] team = new Programmer[total];
        for(int i = 0;i<team.length;i++){
            team[i] = this.team[i];
        }
        return team;
    }
    /*
     * @Author Robin_Wu
     * @Description 将指定员工添加到开发团队中
     * @Date 21:19 2022/3/21
     * @Param [e]
     * @return void
     **/
    public void addMember(Employee e) throws TeamException {
        //成员已满，无法添加； 该成员不是开发人员，无法添加;该成员已在开发团队中
        if(total>=MAX_MEMBER){
            throw new TeamException("成员已满，无法添加");
        }
        if(!(e instanceof Programmer)){
            throw new TeamException("该成员不是开发人员，无法添加");
        }

        if(isExist(e)){
            throw new TeamException("该成员已在开发团队中");
        }
        //该成员已是某团队成员；该成员正在休假，无法添加；
        Programmer p = (Programmer) e;//一定不会出现类型转换异常
        if("BUSY".equalsIgnoreCase(p.getStatus().getNAME())){
            throw new TeamException("该成员已是某团队成员");
        }else if("VOCATION".equalsIgnoreCase(p.getStatus().getNAME())){
            throw new TeamException("该成员正在休假，无法添加");
        }
        //团队中至多只能有一名架构师;团队中至多只能有两名设计师；团队中至多只能有三名程序员
        //获取team已有成员中架构师、设计师、程序员的人数
        int numOfArch = 0,numOfDes = 0,numOfPro = 0;
        for(int i =0;i<total;i++){
            if(team[i] instanceof Architect){
                numOfArch++;
            }else if(team[i] instanceof Designer){
                numOfDes++;
            }else if(team[i] instanceof Programmer){
                numOfPro++;
            }
        }
        if(p instanceof Architect){
            if(numOfArch >=1){
                throw new TeamException("团队中至多只能有一名架构师");
            }}else if(p instanceof Designer){
                if(numOfDes >=2){
                    throw new TeamException("团队中至多只能有两名设计师");}
            }else if(p instanceof Programmer){
                if(numOfPro >=3){
                    throw new TeamException("团队中至多只能有三名程序员");
                }
            }

        //p的属性赋值
        p.setStatus(Status.BUSY);
        p.setMemberId(counter++);
        //将p(或e)添加到现有的team中
        team[total++] = p;
    }
/*
 * @Author Robin_Wu
 * @Description 判断指定员工是否已经存在于现有的开发团队中
 * @Date 21:28 2022/3/21
 * @Param [e]
 * @return boolean
 **/
    private boolean isExist(Employee e){
        for(int i =0;i<total;i++){
            if(team[i].getId() == e.getId()){
                return true;
            }
        }
        return false;
    }
    /*
     * @Author Robin_Wu
     * @Description 从团队中删除成员
     * @Date 21:20 2022/3/21
     * @Param [memberId]
     * @return void
     **/
    public void removeMember(int memberId) throws TeamException {
        int i =0;
        for(i=0;i<total;i++){
            if(team[i].getMemberId()==memberId){
                team[i].setStatus(Status.FREE);
                break;
            }
        }
        //未找到指定memberId的情况
        if(i==total){
            throw new TeamException("找不到指定memberId的员工，删除失败");
        }
        //后一个元素覆盖前一个元素 实现删除操作
        for(int j=i+1;j<total;j++){
            team[j-1] = team[j];
        }
        team[--total] = null;
//        for(int j=i;j<total-1;j++){
//            team[j] = team[j+1];
//        }

    };
}
