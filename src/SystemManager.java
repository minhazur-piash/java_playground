import java.sql.Blob;

/**
 * Created by minhazur on 5/18/16.
 */
public class SystemManager {
    public static final Object WIFI = new Object();
    private static Object networkConnectionMode;
    private static Blob networkData;

    public static Object getNetworkConnectionMode() {
        return networkConnectionMode;
    }

    public static void setNetworkConnectionMode(Object networkConnectionMode) {
        SystemManager.networkConnectionMode = networkConnectionMode;
    }


    public static Blob getNetworkData() {
        return networkData;
    }

    public static void setNetworkData(Blob networkData) {
        SystemManager.networkData = networkData;
    }
}
