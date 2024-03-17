package com.dao;

import com.bean.User;

public interface userdao {
    boolean add(User user);
    User Byid(String username, String password);
}
