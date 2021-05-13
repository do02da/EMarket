import db.crud.Member;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import util.HibernateUtil;

public class HibernateTest {
    Logger logger = (Logger) LogManager.getLogger(this.getClass());
    SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

    @Test
    public void test() {
        logger.debug("insert test");

        Member member = Member.builder()
                .name("test4")
                .message("test message3")
                .build();
        Session session = sessionFactory.getCurrentSession();

        session.beginTransaction();

        // 각각의 처리 들어갈 부분

        session.save(member);

        session.getTransaction().commit();
        Assertions.assertEquals(1, 1);

    }

} // class
