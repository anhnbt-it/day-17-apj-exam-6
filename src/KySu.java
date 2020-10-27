import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: AnhNBT (anhnbt.it@gmail.com)
 * Date: 10/27/2020
 * Time: 2:34 PM
 */
public class KySu extends CanBo {
    private String industry;

    public KySu() {

    }

    public KySu(String industry, String name, Date dateOfBirth, boolean gender, String address) {
        super(name, dateOfBirth, gender, address);
        this.industry = industry;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    @Override
    public String toString() {
        return "KySu{" +
                "industry='" + industry + '\'' +
                super.toString() +
                '}';
    }
}
