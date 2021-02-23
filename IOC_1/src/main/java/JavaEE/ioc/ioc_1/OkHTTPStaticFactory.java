package JavaEE.ioc.ioc_1;

import okhttp3.OkHttpClient;

public class OkHTTPStaticFactory {
    private static OkHttpClient okHttpClient;
    public static OkHttpClient getInstance() {
        if(okHttpClient == null){
            okHttpClient = new OkHttpClient.Builder()
                    .build();
        }
        return okHttpClient;
    }
}
