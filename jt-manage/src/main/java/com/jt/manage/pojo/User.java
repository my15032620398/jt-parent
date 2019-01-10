package com.jt.manage.pojo;

/**
 * @Description: java类作用描述
 * @Author: my
 * @CreateDate: 2019/1/6 23:28
 * @UpdateUser:
 * @UpdateDate: 2019/1/6 23:28
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
public class User {
    private Integer id;
    private String name;
    private Integer age;
    private String sex;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
