package com.example.fairbaseregistration

import com.google.firebase.database.IgnoreExtraProperties

@IgnoreExtraProperties
data class UserInfo(
    val email: String = "",
    val password: String? = "")