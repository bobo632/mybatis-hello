import com.sunyx.domain.Emp;
import com.sunyx.util.SqlSessionFactoryUtil;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

/**
 * Created by liuli on 2019/1/22.
 */
public class Demo1 {
    @Test
    public void test1() throws IOException {
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        System.out.println(sqlSession);
        sqlSession.rollback();
        Emp emp = sqlSession.selectOne("getEmpById",4);
        System.out.println(emp);
        sqlSession.close();
    }
    @Test
    public void test2()  {
        SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtil.getSqlSessionFactory();
        SqlSession sqlSession = sqlSessionFactory.openSession();
        List<Emp> emps= sqlSession.selectList("emp.getEmpByName","%Tom%");
        for(Emp emp:emps){
            System.out.println(emp);
        }
    }

    @Test
    public void test3()  {
        SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtil.getSqlSessionFactory();
        SqlSession sqlSession = sqlSessionFactory.openSession();
        List<Emp> emps= sqlSession.selectList("emp.getEmpByName1","Tom");
        for(Emp emp:emps){
            System.out.println(emp);
        }
        sqlSession.close();
    }
    @Test
    public void test4()  {
        SqlSession sqlSession = SqlSessionFactoryUtil.getSqlSessionFactory().openSession();
        Emp emp = new Emp();
        emp.setName("james");
        emp.setSalary(1000D);
        sqlSession.insert("insertEmp",emp);
        System.out.println(emp);
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void test5()  {
        SqlSession sqlSession = SqlSessionFactoryUtil.getSqlSessionFactory().openSession();
        Emp emp = new Emp();
        emp.setName("james");
        emp.setSalary(1000D);
        sqlSession.insert("insertEmp1",emp);
        System.out.println(emp);
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
     public void test6()  {
        SqlSession sqlSession = SqlSessionFactoryUtil.getSqlSessionFactory().openSession();
        Emp emp = new Emp();
        emp.setId(11);
        emp.setName("james123");
        sqlSession.update("updateEmp",emp);
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void test7()  {
        SqlSession sqlSession = SqlSessionFactoryUtil.getSqlSessionFactory().openSession();
        sqlSession.delete("deleteEmp", 11);
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void test8(){
        SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtil.getSqlSessionFactory();
        SqlSession sqlSession = sqlSessionFactory.openSession();
        RowBounds rowBounds = new RowBounds(0,2);
        List<Emp> emps= sqlSession.selectList("getEmpByName", "Tom",rowBounds);
        for(Emp emp:emps){
            System.out.println(emp);
        }
        sqlSession.close();
    }
    @Test
    public void test9() throws IOException {
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        System.out.println(sqlSession);
        sqlSession.rollback();
        Map map = sqlSession.selectOne("getEmpByIdMap",4);
        System.out.println(map);
        sqlSession.close();
    }
}
