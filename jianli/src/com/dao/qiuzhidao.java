package com.dao;


import com.bean.Qiuzhi;
import com.bean.User;

public interface qiuzhidao {
    boolean add(Qiuzhi qiuzhi);
    Qiuzhi userinf(String uname);
    boolean update(Qiuzhi qiuzhi);
}

