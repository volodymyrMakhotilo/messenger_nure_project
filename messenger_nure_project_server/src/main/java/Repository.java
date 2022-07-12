import models.User;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public interface Repository {
    void addUser();

    void getUser(int UserId);

    void updateUser();
}


class RepositoryImpl implements Repository {
    SessionFactory db;

    RepositoryImpl(SessionFactory db) {
        this.db = db;
    }

    public void addUser() {

    }

    public void getUser(int UserId) {
        Session session = db.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            User user = (User) session.get(User.class, UserId);
            System.out.println(user);
            session.delete(user);
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }

    }

    public void updateUser() {

    }


}
