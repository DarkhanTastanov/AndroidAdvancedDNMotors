package com.example.domain.util

import android.util.Base64
import android.util.Log
import java.io.File

object FileUtils {

    private const val TAG = "FileUtils"

    fun fileToBase64(file: File): String {
        return try {
            Base64.encodeToString(file.readBytes(), Base64.DEFAULT)
        } catch (e: Exception) {
            Log.e(TAG, "File to Base64 error: ${e.message}", e)
            ""
        }
    }

}
