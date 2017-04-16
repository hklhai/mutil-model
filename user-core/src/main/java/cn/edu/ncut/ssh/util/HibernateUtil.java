package cn.edu.ncut.ssh.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Created by lenovo on 2017/4/14.
 */
public class HibernateUtil {
    /**
     * SessionFactory是单例
     */
    private static SessionFactory factory = null;

    static {
        factory = new Configuration().configure().buildSessionFactory();
    }

    public static Session openSession() {
        return factory.openSession();
    }
}
