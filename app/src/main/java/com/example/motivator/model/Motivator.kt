package com.example.motivator.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Motivator (@StringRes val stringResourceId: Int,
                      @DrawableRes val imageResourceId: Int)