package com.example.nbalottery
import com.squareup.moshi.JsonClass
import com.squareup.moshi.Json


@JsonClass(generateAdapter = true)
data class Lottery (
    @Json(name = "0") val p1 : String,
    @Json(name = "1") val p2 : String,
    @Json(name = "2") val p3 : String,
    @Json(name = "3") val p4 : String,
    @Json(name = "4") val p5 : String,
    @Json(name = "5") val p6 : String,
    @Json(name = "6") val p7 : String,
    @Json(name = "7") val p8 : String,
    @Json(name = "8") val p9 : String,
    @Json(name = "9") val p10 : String,
    @Json(name = "10") val p11 : String,
    @Json(name = "11") val p12 : String,
    @Json(name = "12") val p13 : String,
    @Json(name = "13") val p14 : String,
    @Json(name = "14") val p15 : String,
    @Json(name = "15") val p16 : String,
    @Json(name = "16") val p17 : String,
    @Json(name = "17") val p18 : String,
    @Json(name = "18") val p19 : String,
    @Json(name = "19") val p20 : String,
    @Json(name = "20") val p21 : String,
    @Json(name = "21") val p22 : String,
    @Json(name = "22") val p23 : String,
    @Json(name = "23") val p24 : String,
    @Json(name = "24") val p25 : String,
    @Json(name = "25") val p26 : String,
    @Json(name = "26") val p27 : String,
    @Json(name = "27") val p28 : String,
    @Json(name = "28") val p29 : String,
    @Json(name = "29") val p30 : String,
)