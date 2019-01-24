package com.sunyx.dao.impl;

import com.sunyx.dao.EmpDao;
import com.sunyx.domain.Emp;
import com.sunyx.domain.EmpVo;
import com.sunyx.util.SqlSessionFactoryUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * Created by liuli on 2019/1/23.
 */
public class EmpDaoImpl implements EmpDao {
    @Override
    public Emp getEmpById(Integer id) {
        SqlSession sqlSession = SqlSessionFactoryUtil.getSqlSessionFactory().openSession();
        return sqlSession.selectOne("getEmpById",id);
    }

    @Override
    public List<Emp> getEmpByName(String name) {
        SqlSession sqlSession = SqlSessionFactoryUtil.getSqlSessionFactory().openSession();
        return sqlSession.selectList("getEmpByName",name);
    }

    @Override
    public void insertEmp(Emp emp) {
        SqlSession sqlSession = SqlSessionFactoryUtil.getSqlSessionFactory().openSession();
        sqlSession.insert("insertEmp",emp);
    }

    @Override
    public List<Emp> getEmpByQueryVo(EmpVo empVo) {
        return null;
    }

    @Override
    public Integer getCount() {
        return null;
    }

    @Override
    public Emp getEmpByIdMap1(Integer id) {
        return null;
    }

    @Override
    public List<Emp> getEmpByWhere(Emp emp) {
        return null;
    }

    @Override
    public List<Emp> getEmpByIds(EmpVo empVo) {
        return null;
    }
}
