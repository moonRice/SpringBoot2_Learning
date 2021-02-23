package JavaEE.ioc.ioc_1;

import okhttp3.OkHttpClient;

public class OkHTTPFactory {
    private static OkHttpClient okHttpClient;

    public static OkHttpClient getInstancessssss() {
        if(okHttpClient == null){
            okHttpClient = new OkHttpClient.Builder()
                    .build();
        }
        return okHttpClient;
    }
}
