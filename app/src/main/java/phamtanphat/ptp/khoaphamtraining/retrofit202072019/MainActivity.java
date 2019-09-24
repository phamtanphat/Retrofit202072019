package phamtanphat.ptp.khoaphamtraining.retrofit202072019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 1 : Khoi tao moi truong request cua retrofit
        // 2 : Khoi tao gson : de khi dung thu gson format du lieu cho retrofit hieu
        Gson gson = new GsonBuilder().setLenient().create();

        Retrofit retrofit = new Retrofit.Builder()
                        .addConverterFactory(GsonConverterFactory.create(gson))
                        .baseUrl("https://khoapham.vn/KhoaPhamTraining/json/tien/")
                        .build();

        // 4 : Khoi tao lop interface de goi request o ben trong
        RequestApi requestApi = retrofit.create(RequestApi.class);
        // 5: Goi api thuc thi trong lop interface
        Call<Demo1> callback =  requestApi.dataapiDemo1();
        //6 : Goi call back lay du lieu
        callback.enqueue(new Callback<Demo1>() {
            @Override
            public void onResponse(Call<Demo1> call, Response<Demo1> response) {
//                Demo1 demo1 = response.body();
//                Log.d("BBB",demo1.getLogo());
            }

            @Override
            public void onFailure(Call<Demo1> call, Throwable t) {

            }
        });

        // demo2
        Call<Demo2> callDemo2 = requestApi.dataapiDemo2();
        callDemo2.enqueue(new Callback<Demo2>() {
            @Override
            public void onResponse(Call<Demo2> call, Response<Demo2> response) {
                Demo2 demo2 = response.body();
                for (Danhsach danhsach : demo2.getDanhsach()){
                    Log.d("BBB",danhsach.getKhoahoc());
                }
            }

            @Override
            public void onFailure(Call<Demo2> call, Throwable t) {

            }
        });
    }
}
