package mdacne

import com.google.gson.GsonBuilder
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

object BaseApiClient {
    private var retrofit: Retrofit? = null
    private const val BASE_URL = "https://mdacne-staging.herokuapp.com/api/v2/"

    val retrofitInstance: Retrofit?
        get() {
            if (retrofit == null) {
                val gson = GsonBuilder()
                    .setLenient()
                    .create()

                val interceptor = httpLoggingInterceptor()
                val client = OkHttpClient.Builder()
                    .readTimeout(60, TimeUnit.SECONDS)
                    .connectTimeout(60, TimeUnit.SECONDS)
                    .addInterceptor(interceptor)
                    .build()

                // creates a retrofit instance for requests
                retrofit = Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create(gson))
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .client(client)
                    .build()

            }
            return retrofit
        }

    private fun httpLoggingInterceptor(): Interceptor {
        // creates an interceptor for logging
        val interceptor = HttpLoggingInterceptor()
        interceptor.level = HttpLoggingInterceptor.Level.BODY
        return interceptor
    }

}