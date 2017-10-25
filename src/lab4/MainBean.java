package lab4;
import javax.ejb.Remove;
import javax.ejb.Stateful;
import javax.ejb.StatefulTimeout;
import java.util.concurrent.TimeUnit;

@Stateful
@StatefulTimeout(value = 20, unit = TimeUnit.SECONDS)
public class MainBean {
    //private BDManager;
    private boolean isAuthorized = false;
    public void addPoint(Point point) {

    }
    @Remove
    public void checkout() {
        isAuthorized = false;
    }
}
