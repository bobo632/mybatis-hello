package com.sunyx.dao;

import com.sunyx.domain.Emp;
import com.sunyx.domain.EmpVo;

import java.util.List;

/**
 * Created by liuli on 2019/1/23.
 */
public interface EmpDao {
    public Emp getEmpById(Integer id);
    public List<Emp> getEmpByName(String name);
    public void insertEmp(Emp emp);
    public List<Emp> getEmpByQueryVo(EmpVo empVo);
    public Integer getCount();
    public Emp getEmpByIdMap1(Integer id);
    public List<Emp> getEmpByWhere(Emp emp);
    public List<Emp> getEmpByIds(EmpVo empVo);
}
