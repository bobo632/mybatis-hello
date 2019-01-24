import com.sunyx.dao.OrderMapper;
import com.sunyx.dao.UserMapper;
import com.sunyx.domain.Order;
import com.sunyx.domain.OrderUser;
import com.sunyx.domain.User;
import com.sunyx.util.SqlSessionFactoryUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * Created by liuli on 2019/1/23.
 */
public class Demo4 {
    @Test
    public void test1(){
        SqlSession sqlSession = SqlSessionFactoryUtil.getSqlSessionFactory().openSession();
        OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
        List<OrderUser> orderUsers = orderMapper.getOrderUser();
        for (OrderUser orderUser:orderUsers){
            System.out.println(orderUser);
        }
    }
    @Test
    public void test2(){
        SqlSession sqlSession = SqlSessionFactoryUtil.getSqlSessionFactory().openSession();
        OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
        List<Order> orders = orderMapper.getOrderUser2();
        for (Order order:orders){
            System.out.println(order);
            System.out.println(order.getUser());
        }
    }

    @Test
    public void test3(){
        SqlSession sqlSession = SqlSessionFactoryUtil.getSqlSessionFactory().openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = userMapper.getUserOrder();
        for (User user :users){
            System.out.println(user);
            System.out.println(user.getOrders());
        }
    }

}
