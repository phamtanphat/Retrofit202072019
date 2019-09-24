package phamtanphat.ptp.khoaphamtraining.retrofit202072019;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RequestApi {

//     basse url : https://khoapham.vn/KhoaPhamTraining/json/tien/
//     url con lai : demo1.json
    //3 : Tao ra request
    @GET("demo1.json")
    Call<Demo1> dataapiDemo1();

    @GET("demo2.json")
    Call<Demo2> dataapiDemo2();
}
