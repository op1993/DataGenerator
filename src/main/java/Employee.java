import java.time.LocalDate;

/**
 * Created by Oleh on 30/05/2017.
 */
public class Employee {
    private int staffNo;
    private String firstName;
    private String lastName;
    private String gender;
    private LocalDate dateOfBirth;
    private LocalDate dateOfJoin;
    private LocalDate dateOfLastPromotion;
    private LocalDate leaveDate;
    private float fte;
    private String grade;
    private int supervisorId;
    private String positionTitle;
    private String orgTree1;
    private String orgTree2;
    private String orgTree3;
    private String orgTree4;

    public Employee(int staffNo, String firstName,
                    String lastName, String gender,
                    LocalDate dateOfBirth, LocalDate dateOfJoin,
                    LocalDate dateOfLastPromotion,
                    LocalDate leaveDate, float fte,
                    String grade, int supervisorId,
                    String positionTitle, String orgTree1, String orgTree2,
                    String orgTree3, String orgTree4) {
        this.staffNo = staffNo;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.dateOfJoin = dateOfJoin;
        this.dateOfLastPromotion = dateOfLastPromotion;
        this.leaveDate = leaveDate;
        this.fte = fte;
        this.grade = grade;
        this.supervisorId = supervisorId;
        this.positionTitle = positionTitle;
        this.orgTree1 = orgTree1;
        this.orgTree2 = orgTree2;
        this.orgTree3 = orgTree3;
        this.orgTree4 = orgTree4;
    }


}
