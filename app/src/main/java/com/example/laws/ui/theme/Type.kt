package com.example.laws.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.laws.R

val CrimsonText = FontFamily(
    Font(R.font.crimson_text_bold, FontWeight.Bold)
)

val Lora = FontFamily(
    Font(R.font.lora_legular),
)

val Typography = Typography(
    headlineLarge = TextStyle(
        fontFamily = CrimsonText,
        fontWeight = FontWeight.Bold,
        fontSize = 36.sp
    ),

    titleMedium = TextStyle(
        fontFamily = CrimsonText,
        fontWeight = FontWeight.Bold,
        fontSize = 20.sp
    ),

    bodyMedium = TextStyle(
        fontFamily = Lora,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    )
)
