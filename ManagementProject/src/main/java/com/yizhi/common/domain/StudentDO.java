package com.yizhi.common.domain;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class StudentDO {

    //学号
    private String studentId;
    //考生号
    private String examId;
    //所属班级
    private Integer classId;
    //学生姓名
    private String studentName;
    //身份证号
    private String certify;
    //家庭住址
    private String mailAddress;
    //外语语种
    private String foreignLanaguage;
    //性别
    private String studentSex;
    //民族
    private String nation;
    //政治面貌
    private String political;
    //一卡通卡号
    private String cardId;
    //手机号
    private String telephone;
    //科类
    private Integer subjectType;
    //所属学院
    private Integer tocollege;

    //所属专业
    private Integer tomajor;
    //生源地
    private String birthplace;
    //隶属层次
    private String grade;
    //在校状态
    private Integer isstate;
    //出生日期
    private Date birthday;
    //备注
    private String note;
}
