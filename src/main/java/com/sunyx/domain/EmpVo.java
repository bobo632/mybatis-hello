package com.sunyx.domain;

import java.util.List;

/**
 * Created by liuli on 2019/1/23.
 */
public class EmpVo {
    private Emp emp;
    private List<Integer> ids;

    public List<Integer> getIds() {
        return ids;
    }

    public void setIds(List<Integer> ids) {
        this.ids = ids;
    }

    public Emp getEmp() {
        return emp;
    }

    public void setEmp(Emp emp) {
        this.emp = emp;
    }
}
