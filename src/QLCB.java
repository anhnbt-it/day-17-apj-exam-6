import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: AnhNBT (anhnbt.it@gmail.com)
 * Date: 10/27/2020
 * Time: 2:37 PM
 */
public class QLCB {
    private List<CanBo> list;

    public QLCB() {
        list = new ArrayList<>();
    }

    public void add(CanBo o) {
        list.add(o);
    }

    public void show() {
        for (CanBo canBo: list) {
            System.out.println(canBo.toString());
        }
    }

    public int size() {
        return list.size();
    }

    public CanBo searchByName(String name) {
        for (CanBo canBo: list) {
            if (canBo.getName().equals(name)) {
                return canBo;
            }
        }
        return null;
    }
}
