package cn.edu.ncut.ssh.user;

import cn.edu.ncut.ssh.util.HibernateUtil;
import org.hibernate.Session;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by lenovo on 2017/4/14.
 */
public class TestUser {
    @Test
    public void addUser() {
        Session session = HibernateUtil.openSession();
        session.beginTransaction();
        @SuppressWarnings("unused")
        User user = new User("admin", "admin", "F");
        //session.save(user);

        //Assert.assertTrue(user.getId()>0);

        session.getTransaction().commit();
    }

    @Test
    public void getUser() {
        Session session = HibernateUtil.openSession();
        session.beginTransaction();
        User user = (User) session.load(User.class, 1);


        Assert.assertEquals(1, user.getId());

        session.getTransaction().commit();
    }
}
