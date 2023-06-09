package com.example.xinwen.db

data class XianWeather(
    val code: Int,
    val `data`: WeatherData,
    val log_id: Long,
    val msg: String,
    val time: Int
)

data class WeatherData(
    val basic: Basic,
    val now: Now,
    val status: String,
    val update: Update
)

data class Basic(
    val admin_area: String,
    val cid: String,
    val cnty: String,
    val lat: String,
    val location: String,
    val lon: String,
    val parent_city: String,
    val tz: String
)

data class Now(
    val cloud: String,
    val cond_code: String,
    val cond_txt: String,
    val fl: String,
    val hum: String,
    val pcpn: String,
    val pres: String,
    val tmp: String,
    val vis: String,
    val wind_deg: String,
    val wind_dir: String,
    val wind_sc: String,
    val wind_spd: String
)

data class Update(
    val loc: String,
    val utc: String
)