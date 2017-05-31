import java.time.LocalDate;
import java.util.ArrayList;

/**
 * Created by Oleh on 30/05/2017.
 */
public class TestTest {

    static ArrayList<Object> employeeProperties = new ArrayList<>();
    static Generator dg = new Generator();
    static String ds = "2017-01-31";


    public static void main(String[] args) {
        dg.setOrgTree1Level(50);
        dg.setOrgTree2Level(8);
        dg.setOrgTree3Level(10);
        dg.setOrgTree4Level(16);

        for (int i = 1; i < 20; i++) {
            Employee employee = new Employee(
                    i,
                    "Name " + i,
                    "last name " + i,
                    dg.generateGender(),
                    dg.generateDateOfBirth(LocalDate.parse(ds)),
                    dg.generateDateOfJoin(LocalDate.parse(ds)),
                    null,
                    null,
                    dg.generateFte(),
                    dg.generateGrade(),
                    0,
                    null,
                    dg.generateOrgTree1(),
                    dg.generateOrgTree2(),
                    dg.generateOrgTree3(),
                    dg.generateOrgTree4()
            );

            employeeProperties.add(employee);


        }

        System.out.println(employeeProperties.size());
        System.out.println(employeeProperties.get(1));
        System.out.println(employeeProperties);
    }
}
