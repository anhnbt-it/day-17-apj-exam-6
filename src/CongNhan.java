import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: AnhNBT (anhnbt.it@gmail.com)
 * Date: 10/27/2020
 * Time: 2:31 PM
 */
public class CongNhan extends CanBo {
    private String level;

    public CongNhan() {}

    public CongNhan(String level, String name, Date dateOfBirth, boolean gender, String address) {
        super(name, dateOfBirth, gender, address);
        this.level = level;
    }

    public String getlevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "CongNhan{" +
                "level='" + level + '\'' +
                super.toString() +
                '}';
    }
}
