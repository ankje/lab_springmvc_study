package com.ankje.mybatis.study.model;

import java.util.List;

public class UserQueryVo extends User {
    private List<Integer> ids;
    private UserCustom userCustom;

    public UserCustom getUserCustom() {
        return userCustom;
    }

    public UserQueryVo setUserCustom(UserCustom userCustom) {
        this.userCustom = userCustom;
        return this;
    }

    public List<Integer> getIds() {
        return ids;
    }

    public UserQueryVo setIds(List<Integer> ids) {
        this.ids = ids;
        return this;
    }
}
