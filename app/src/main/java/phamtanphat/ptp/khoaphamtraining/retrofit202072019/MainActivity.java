package phamtanphat.ptp.khoaphamtraining.retrofit202072019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

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
    }
}
