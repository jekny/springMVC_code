package com.hyw.mytest.javaDTO;

/**
 * ClassName: UserJavaBean
 * Description:
 *
 * @Author jekny
 * @Create 2026/6/2 18:47
 * @Version 1.0
 */
public class UserJavaBean {
    private String id;
    private String name;

    public UserJavaBean() {
    }

    @Override
    public String toString() {
        return "UserJavaBean{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UserJavaBean(String id, String name) {
        this.id = id;
        this.name = name;
    }
}
