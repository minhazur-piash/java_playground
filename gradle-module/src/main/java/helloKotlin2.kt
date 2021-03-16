import mdacne.ApiService
import mdacne.BaseApiClient
import mdacne.Test
import okhttp3.MediaType
import okhttp3.MultipartBody
import okhttp3.RequestBody
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.io.File


fun main() {
    val apiService = BaseApiClient.retrofitInstance?.create(ApiService::class.java)
    val call = apiService?.getShipmentInfo("1021175", "MsMcqHVhoYs_mGoJDds");
    call?.enqueue(object : Callback<ResponseBody> {
        override fun onFailure(call: Call<ResponseBody>, t: Throwable) {
            print("===> onFailuer " + t.localizedMessage)
        }

        override fun onResponse(call: Call<ResponseBody>, response: Response<ResponseBody>) {
            print("===> onSuccess ${response.body()?.string()}")
        }
    })

}

private fun uploadImage() {
    val url = Test::class.java.getResource("/1250857.png")
    println("===> $url")

    //Create a file object using file path
    //Create a file object using file path
    val file = File(url.toURI());
    println("===> is file exist: ${file.exists()}")
    // Create a request body with file and image media type
    // Create a request body with file and image media type
    val fileReqBody: RequestBody = RequestBody.create(MediaType.parse("image/png"), file)
    // Create MultipartBody.Part using file request-body,file name and part name
    // Create MultipartBody.Part using file request-body,file name and part name
    val image: MultipartBody.Part = MultipartBody.Part.createFormData("clean_image", file.name, fileReqBody)
    //Create request body with text description and text media type
    //Create request body with text description and text media type
    val description = RequestBody.create(MediaType.parse("text/plain"), "image-type")

    val uIdRequestBody = RequestBody.create(MediaType.parse("text/plain"), "2867612200273523116")
    val userIdRequestBody = RequestBody.create(MediaType.parse("text/plain"), "1021175")
    val genderRequestBody = RequestBody.create(MediaType.parse("text/plain"), "Male")
    val ageGroupRequestBody = RequestBody.create(MediaType.parse("text/plain"), "15 to 20")
    val deviceIdRequestBody = RequestBody.create(MediaType.parse("text/plain"), "sdfsdfa3434wf")
    val subjectiveRequestBody = RequestBody.create(MediaType.parse("text/plain"), "5")
    val objectiveRequestBody = RequestBody.create(MediaType.parse("text/plain"), "5")
    val dimensionsRequestBody = RequestBody.create(MediaType.parse("text/plain"), "1080x1920")

    val apiService = BaseApiClient.retrofitInstance?.create(ApiService::class.java)
    val call = apiService?.uploadImage(image, uIdRequestBody, userIdRequestBody, deviceIdRequestBody,
            dimensionsRequestBody, genderRequestBody, ageGroupRequestBody, subjectiveRequestBody, objectiveRequestBody)
    call?.enqueue(object : Callback<ResponseBody> {
        override fun onFailure(call: Call<ResponseBody>, t: Throwable) {
            print("===> onFailuer " + t.localizedMessage)
        }

        override fun onResponse(call: Call<ResponseBody>, response: Response<ResponseBody>) {
            print("===> onSuccess ${response.body()?.string()}")
        }
    })
}
