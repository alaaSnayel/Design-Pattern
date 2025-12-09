import com.phone.OS;
import com.phone.OperatingSystemFactory;

public class FactoryMain {
    public static void main(String[] args) throws Exception {
        
        OperatingSystemFactory osf = new OperatingSystemFactory();

        OS obj = osf.getInstance("Open");
        obj.spec();
    }
}
