import com.sunyx.dao.EmpDao;
import com.sunyx.domain.Emp;
import com.sunyx.domain.EmpVo;
import com.sunyx.util.SqlSessionFactoryUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Created by liuli on 2019/1/23.
 */
public class Demo3 {
    @Test
    public void test1(){
        SqlSession sqlSession = SqlSessionFactoryUtil.getSqlSessionFactory().openSession();
        EmpDao empDao = sqlSession.getMapper(EmpDao.class);
        Emp emp = empDao.getEmpById(3);
        System.out.println(emp);
    }
    @Test
    public void test2(){
        SqlSession sqlSession = SqlSessionFactoryUtil.getSqlSessionFactory().openSession();
        EmpDao empDao = sqlSession.getMapper(EmpDao.class);
        List<Emp> emps = empDao.getEmpByName("Tom");
        for (Emp emp:emps){
            System.out.println(emp);
        }
    }
    @Test
    public void test3(){
        SqlSession sqlSession = SqlSessionFactoryUtil.getSqlSessionFactory().openSession();
        EmpDao empDao = sqlSession.getMapper(EmpDao.class);
        Emp emp = new Emp();
        emp.setName("111");
        emp.setSalary(400D);
        empDao.insertEmp(emp);
        sqlSession.commit();
    }
    @Test
    public void test4(){
        SqlSession sqlSession = SqlSessionFactoryUtil.getSqlSessionFactory().openSession();
        EmpDao empDao = sqlSession.getMapper(EmpDao.class);
        EmpVo empVo = new EmpVo();
        Emp emp = new Emp();
        emp.setName("Tom");
        empVo.setEmp(emp);
        List<Emp> emps = empDao.getEmpByQueryVo(empVo);
        for (Emp emp1:emps){
            System.out.println(emp1);
        }
    }
    @Test
    public void test5(){
        SqlSession sqlSession = SqlSessionFactoryUtil.getSqlSessionFactory().openSession();
        EmpDao empDao = sqlSession.getMapper(EmpDao.class);
        int count = empDao.getCount();
        System.out.println(count);
    }
    @Test
         public void test6(){
        SqlSession sqlSession = SqlSessionFactoryUtil.getSqlSessionFactory().openSession();
        EmpDao empDao = sqlSession.getMapper(EmpDao.class);
        Emp emp = empDao.getEmpByIdMap1(3);
        System.out.println(emp);
    }
    @Test
    public void test7(){
        SqlSession sqlSession = SqlSessionFactoryUtil.getSqlSessionFactory().openSession();
        EmpDao empDao = sqlSession.getMapper(EmpDao.class);
        Emp emp = new Emp();
        emp.setId(4);
        emp.setName("Tom");
        List<Emp> emps = empDao.getEmpByWhere(emp);
        System.out.println(emps);
    }
    @Test
    public void test8(){
        SqlSession sqlSession = SqlSessionFactoryUtil.getSqlSessionFactory().openSession();
        EmpDao empDao = sqlSession.getMapper(EmpDao.class);
        EmpVo empVo = new EmpVo();
        empVo.setIds(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        List<Emp> emps = empDao.getEmpByIds(empVo);
        for (Emp emp:emps){
            System.out.println(emp);
        }
    }
}
