package mdacne

import okhttp3.MultipartBody
import okhttp3.RequestBody
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.*

interface ApiService {
    @Multipart
    @POST("https://mdacne-long-requests.herokuapp.com/api/v2/research_data.json")
    fun uploadImage(@Part image: MultipartBody.Part,
                    @Part("unique_user_id") uId: RequestBody, @Part("user_id") userId: RequestBody, @Part("device_id") deviceId: RequestBody,
                    @Part("dimensions") dimensions: RequestBody, @Part("gender") gender: RequestBody, @Part("age_group") ageGroup: RequestBody,
                    @Part("subjective_assesment") subjectiveAssesment: RequestBody, @Part("objective_assesment") objective_assesment: RequestBody): Call<ResponseBody>

    // https://mdacne.herokuapp.com/api/v2/users/1021175/shipments?auth_token=MsMcqHVhoYs_mGoJDds
    @Headers("User-Agent:curl/7.64.1", "Accept: */*", "Host: mdacne.herokuapp.com")
    @GET("https://mdacne.herokuapp.com/api/v2/users/{userId}}/shipments")
    fun getShipmentInfo(@Path("userId") userId: String, @Query("auth_token") authToken: String): Call<ResponseBody>
}