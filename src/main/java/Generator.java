
import java.time.LocalDate;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by Oleh on 30/05/2017.
 */
public class Generator {

    private List<String> gender = Arrays.asList("F", "M");
    private LocalDate dateOfBirth;
    private LocalDate dateOfJoin;
    private int orgTree1Level = 5;
    private int orgTree2Level = 10;
    private int orgTree3Level = 13;
    private int orgTree4Level = 20;


    public void setOrgTree3Level(int orgTree3Level) {
        this.orgTree3Level = orgTree3Level;
    }

    public void setOrgTree1Level(int orgTree1Level) {
        this.orgTree1Level = orgTree1Level;
    }

    public void setOrgTree2Level(int orgTree2Level) {
        this.orgTree2Level = orgTree2Level;
    }

    public void setOrgTree4Level(int orgTree4Level) {
        this.orgTree4Level = orgTree4Level;
    }

    Random random = new Random();

    public String generateGender() {
        return gender.get(random.nextInt(gender.size()));
    }

    public float generateFte(){
        return random.nextFloat() * 1f+ 0.1f;
    }

    public LocalDate generateDateOfBirth(LocalDate dateStamp) {
        LocalDate startDate = LocalDate.of(1955, 01, 01);
        long start = startDate.toEpochDay();
        LocalDate endDate = (dateStamp.minusYears(18));
        long end = endDate.toEpochDay();
        return dateOfBirth = LocalDate.ofEpochDay(ThreadLocalRandom.current().longs(start, end).findAny().getAsLong());
    }

    public   LocalDate generateDateOfJoin(LocalDate dateStamp) {
            LocalDate startDate = dateOfBirth.plusYears(18);
            long start = startDate.toEpochDay();
            LocalDate endDate = dateStamp;
            long end = endDate.toEpochDay();
        return dateOfJoin = LocalDate.ofEpochDay(ThreadLocalRandom.current().longs(start, end).findAny().getAsLong());
    }

    public String generateGrade(){
        return Character.toString((char) (new Random().nextInt(26) + 'a')).toUpperCase();
    }

    public  String generateOrgTree1() {
        ArrayList<String> temp = new ArrayList<>();
        for (int i = 1; i < orgTree1Level; i++) {
            temp.add("Org Tree " + i);
        }
        return temp.get(random.nextInt(temp.size()));
    }

    public  String generateOrgTree2() {
        ArrayList<String> temp = new ArrayList<>();
        for (int i = 1; i < orgTree2Level; i++) {
            temp.add("Org Tree " + i);
        }
        return temp.get(random.nextInt(temp.size()));
    }

    public  String generateOrgTree3() {
        ArrayList<String> temp = new ArrayList<>();
        for (int i = 1; i < orgTree3Level; i++) {
            temp.add("Org Tree " + i);
        }
        return temp.get(random.nextInt(temp.size()));
    }

    public  String generateOrgTree4() {
        ArrayList<String> temp = new ArrayList<>();
        for (int i = 1; i < orgTree4Level; i++) {
            temp.add("Org Tree " + i);
        }
        return temp.get(random.nextInt(temp.size()));
    }
}
