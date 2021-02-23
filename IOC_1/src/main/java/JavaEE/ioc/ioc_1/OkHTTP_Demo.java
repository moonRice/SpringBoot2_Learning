package JavaEE.ioc.ioc_1;

import okhttp3.*;
import org.jetbrains.annotations.NotNull;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class OkHTTP_Demo {
    /**
     * 功能：打印指定网页源代码
     * */
    public static void main(String[] args) {
//        OkHttpClient okHttpClient = new OkHttpClient.Builder()
//                .build();
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        OkHttpClient okHttpClient = ctx.getBean("okHttpClient22", OkHttpClient.class);
        Request request = new Request.Builder()
                .get()
                .url("http://cn.bing.com/")
                .build();
        Call call = okHttpClient.newCall(request);
        call.enqueue(new Callback() {
            @Override
            public void onFailure(@NotNull Call call, @NotNull IOException e) {
                System.out.println("e.getMessage() = " + e.getMessage());
            }

            @Override
            public void onResponse(@NotNull Call call, @NotNull Response response) throws IOException {
                System.out.println("response.body().string() = " + response.body().string());
            }
        });
    }
}
