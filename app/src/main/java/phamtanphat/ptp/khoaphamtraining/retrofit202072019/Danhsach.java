package phamtanphat.ptp.khoaphamtraining.retrofit202072019;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Danhsach {

@SerializedName("khoahoc")
@Expose
private String khoahoc;

public String getKhoahoc() {
return khoahoc;
}

public void setKhoahoc(String khoahoc) {
this.khoahoc = khoahoc;
}

}