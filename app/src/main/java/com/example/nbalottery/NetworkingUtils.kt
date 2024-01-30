package com.example.nbalottery

import android.util.Log
import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import okhttp3.Call
import okhttp3.Callback
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.Response
import java.io.IOException


fun getLottery(callback: (Lottery) -> Unit){
    val client = OkHttpClient()
    val request = Request.Builder().url("http://35.236.227.98/simulate").get().build()

    client.newCall(request).enqueue(object : Callback {
        override fun onFailure(call: Call, e: IOException) {
            Log.d("Exception", e.toString())
        }

        override fun onResponse(call: Call, response: Response) {
            val body = response.body
            val moshiInstance : Moshi = Moshi.Builder().add(KotlinJsonAdapterFactory()).build()
            val lotteryAdapter: JsonAdapter<Lottery> = moshiInstance.adapter<Lottery>(Lottery::class.java)

            val myLottery : Lottery = lotteryAdapter.fromJson(body!!.source())!!
            callback(myLottery)
        }
    })
}