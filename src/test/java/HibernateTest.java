import db.crud.Member;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.jupiter.api.Test;
import util.HibernateUtil;

// https://opentutorials.org/course/1519/8279

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HibernateTest {
    Logger logger = (Logger) LogManager.getLogger(this.getClass());
    SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

    @Test
    public void test() {
        logger.debug("삽입작업");

        Member member = new Member("test 2", "hello world");

        Session session = sessionFactory.getCurrentSession();

        session.beginTransaction();

        // 각각의 처리 들어갈 부분
        session.save(member);

        session.getTransaction().commit();
        assertEquals(1,1);
    }
}
