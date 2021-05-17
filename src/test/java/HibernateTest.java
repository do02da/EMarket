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
import static org.junit.jupiter.api.Assertions.assertNull;

public class HibernateTest {
    Logger logger = (Logger) LogManager.getLogger(this.getClass());
    SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

    @Test
    public void test() {
        // Insert
        Member member = new Member("test", "hello test");
        insert(member);

        // Select One
        Member selectedMember = selectedById(1);

        // Update
        selectedMember.setMessage("Hello Hibernate");
        update(selectedMember);
        Member updatedMember = selectedById(1);

        // Delete
        delete(updatedMember);
        Member deletedMember = selectedById(1);

        // 객체 x와 y가 일치함을 확인
        assertNull(deletedMember);
    }

    private void delete(Member updatedMember) {
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        session.delete(updatedMember);
        session.getTransaction().commit();

    }

    private void update(Member selectedMember) {
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        session.update(selectedMember);
        session.getTransaction().commit();
    }

    public Member selectedById(int i) {
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        Member selectedMember = session.get(Member.class, i);

        session.getTransaction().commit();

        return selectedMember;
    }

    private void insert(Member member) {
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        session.save(member);
        session.getTransaction().commit();
    }
}
