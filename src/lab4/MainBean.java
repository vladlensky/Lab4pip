package lab4;
import javax.ejb.Remove;
import javax.ejb.Stateful;
import javax.ejb.StatefulTimeout;
import java.util.concurrent.TimeUnit;

@Stateful
@StatefulTimeout(value = 20, unit = TimeUnit.SECONDS)
public class MainBean {
    //private BDManager;
    public void addPoint(Point point) {

    }

    private boolean isAuthorized = false;
    @Remove
    public void checkout() {
        isAuthorized = false;
    }
}
