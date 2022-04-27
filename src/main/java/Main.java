import com.entity.DepartmentEntity;
import com.entity.DopinfoEntity;
import com.entity.EmployeesEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(EmployeesEntity.class)
                .addAnnotatedClass(DepartmentEntity.class)
                .addAnnotatedClass(DopinfoEntity.class)
                .buildSessionFactory();

        try {
            Session session = factory.getCurrentSession();


            session.beginTransaction();
            EmployeesEntity employees = session.get(EmployeesEntity.class, 1);
            DopinfoEntity dopinfo = session.get(DopinfoEntity.class, 1);

            dopinfo.setEmployees(employees);


            session.save(employees);
            session.save(dopinfo);

            session.getTransaction().commit();

        } finally {
            factory.close();
        }


    }
}