import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: AnhNBT (anhnbt.it@gmail.com)
 * Date: 10/27/2020
 * Time: 2:26 PM
 */
public class NhanVien extends CanBo {
    private String job;

    public NhanVien() {

    }

    public NhanVien(String job) {
        this.job = job;
    }

    public NhanVien(String job, String name, Date dateOfBirth, boolean gender, String address) {
        super(name, dateOfBirth, gender, address);
        this.job = job;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "NhanVien{" +
                "job='" + job + '\'' +
                super.toString() +
                '}';
    }
}
