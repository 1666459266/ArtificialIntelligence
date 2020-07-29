package cn.zptc.ai.util;

public enum ZptcEnum {
    COLLEGE_PROFILE("学院简介"),
    COLLEGE_HONORS("学院荣誉"),
    ORGANIZATION_STRUCTURE("组织机构"),
    TEACHING_STAFF("师资队伍"),
    PROFESSIONAL_INTRODUCTION("专业介绍"),
    TEACHING_WORK("教学工作"),
    SCIENTIFIC_WORK("科研工作"),
    COLLEGE_ACTIVITIES("学院活动"),
    GROUP_lEARNING_WORLD("团学天地"),
    DAILY_MANAGEMENT("日常管理"),
    ATTENDANCE_ANNOUNCEMENT("考勤公示"),
    COLLEGE_STYLE("学院风采"),
    BRANCH_CONSTRUCTION("支部建设"),
    STYLE_OF_PARTY_MEMBERS("党员风采"),
    THEORETICAL_LEARNING("理论学习"),
    ENROLLMENT_WORK("招生工作"),
    EMPLOYMENT_WORK("就业工作"),
    EDUCATIONAL_ADMINISTRATION_MANAGEMENT("教务管理类"),
    STUDENT_MANAGEMENT("学生管理类"),
    EMPLOYMENT_MANAGEMENT("就业管理类"),
    EVALUATION_AND_CONSTRUCTION("评建工作"),
    PROFESSIONAL_CHARACTERISTICS("专业特色"),
    STUDENT_STYLE("学子风采"),
    WEBSITE_INTRODUCTION("网站介绍"),
    WEBSITE_TITLE("网站标题"),
    KEYWORD("关键字"),
    WEBSITE_URL("网站URL"),
    PAGE_LOGO("页面logo");

    private String name;

    ZptcEnum(String s) {
        this.name = s;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
