package com.camera.imageupload;

import okhttp3.MultipartBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

public interface NetworkConnection {
    String BASE_URL4 = "https://webkapil.000webhostapp.com/";

    @Multipart
    @POST("upload/upload_files.php")
    Call<DummyModal> uploadImage(@Part MultipartBody.Part photo);
}