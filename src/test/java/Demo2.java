import com.sunyx.dao.EmpDao;
import com.sunyx.dao.impl.EmpDaoImpl;
import com.sunyx.domain.Emp;
import org.junit.Test;

import java.util.List;

/**
 * Created by liuli on 2019/1/23.
 */
public class Demo2 {
    private EmpDao empDao = new EmpDaoImpl();

    @Test
    public void test1(){
        Emp emp = empDao.getEmpById(3);
        System.out.println(emp);
    }

    @Test
    public void test2(){
        List<Emp> emps = empDao.getEmpByName("Tom");
        for (Emp emp:emps){
            System.out.println(emp);
        }
    }

    @Test
    public void test3(){
        Emp emp = new Emp();
        emp.setName("111");
        emp.setSalary(400D);
        empDao.insertEmp(emp);
    }


}
