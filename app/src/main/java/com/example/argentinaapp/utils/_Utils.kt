package com.example.argentinaapp.utils
import java.util.Calendar


/**
 * Created by Christian Modernel on 7/10/2023 10:58 AM.
 * Email: chrismmodernel@gmail.com
 */
object _Utils {
    fun getDate(year: Int, month: Int, day: Int): Long{
        val calendar = Calendar.getInstance()
        calendar.set(Calendar.HOUR_OF_DAY, 0)
        calendar.set(Calendar.MINUTE, 0)
        calendar.set(Calendar.SECOND, 0)
        calendar.set(Calendar.MILLISECOND, 0)

        calendar.set(Calendar.YEAR, year)
        calendar.set(Calendar.MONTH, month)
        calendar.set(Calendar.DAY_OF_MONTH, day)

        return calendar.timeInMillis
    }
}