import okhttp3.MultipartBody
import okhttp3.RequestBody
import retrofit2.Call
import retrofit2.http.*


interface ApiService {
    // Mendapatkan daftar pengguna dengan kueri
    @GET("api/users")
    fun getListUsers(@Query("page") page: String): Call<ResponseUser>

    // Mendapatkan pengguna berdasarkan id menggunakan path
    @GET("api/users/{id}")
    fun getUser(@Path("id") id: String): Call<ResponseUser>

    // Membuat pengguna menggunakan field x-www-form-urlencoded
    @FormUrlEncoded
    @POST("api/users")
    fun createUser(
            @Field("name") name: String,
            @Field("job") job: String
    ): Call<ResponseUser>

    // Mengunggah file menggunakan multipart
    @Multipart
    @PUT("api/uploadfile")
    fun updateUser(
            @Part file: MultipartBody.Part,
            @PartMap data: Map<String, RequestBody>
    ): Call<ResponseUser>
}
