package com.dao;

import com.bean.Cont;

import java.util.List;

public interface Contdao {
    boolean add(Cont lj);
    List<Cont> list(String username);
    Cont ByMid(String Mid);
    boolean update(Cont lj);
}
