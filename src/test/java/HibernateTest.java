import db.crud.Member;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import util.HibernateUtil;

// https://opentutorials.org/course/1519/8279

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HibernateTest {
    Logger logger = (Logger) LogManager.getLogger(this.getClass());
    SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

    @Test
    public void test() {
        // Insert
        Member member = new Member("test", "hello world");
        insert(member);

        // Select One
        Member selectedMember = selectedById(1);

        // 객체 x와 y가 일치함을 확인
        assertEquals("hello world", selectedMember.getMessage());
    }

    public Member selectedById(int i) {
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();

        // 각각의 처리 들어갈 부분
        Member selectedMember = session.get(Member.class, i);
        session.getTransaction().commit();

        return selectedMember;
    }

    private void insert(Member member) {
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();

        // 각각의 처리 들어갈 부분
        session.save(member);
        session.getTransaction().commit();
    }
}
