package ru.skillbranch.sbdelivery.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import dagger.hilt.android.AndroidEntryPoint
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import ru.skillbranch.sbdelivery.R
import ru.skillbranch.sbdelivery.data.remote.requests.LoginRequest
import ru.skillbranch.sbdelivery.data.remote.requests.RegisterRequest
import ru.skillbranch.sbdelivery.data.remote.responses.LoginResponse
import ru.skillbranch.sbdelivery.data.remote.responses.ProfileResponse
import ru.skillbranch.sbdelivery.data.remote.responses.RegisterResponse
import ru.skillbranch.sbdelivery.data.remote.responses.ReviewResponse
import ru.skillbranch.sbdelivery.network.SbDeliveryApi
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var deliveryApi: SbDeliveryApi

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.AppTheme)
        setContentView(R.layout.activity_main)
        //Thread.sleep(2000)

        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragment_container, EntryFragment()).commit()

        /*deliveryApi.register(RegisterRequest("gromoboy115@yandex.ru",
            "Иван", "Сидоров","SomePassword123")).enqueue(object: Callback<RegisterResponse>{
            override fun onResponse(call: Call<RegisterResponse>, response: Response<RegisterResponse>) {
                if(!response.isSuccessful){
                    Log.d("MainActivity","code : ${response.code()}")
                    return
                }
            }

            override fun onFailure(call: Call<RegisterResponse>, t: Throwable) {
                Log.d("MainActivity","${t.message}")
            }
        })*/


    }
}
