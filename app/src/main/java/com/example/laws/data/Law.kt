package com.example.laws.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.laws.R

data class Law (
    @StringRes val title: Int,
    @StringRes val subTitle: Int,
    @DrawableRes val imageResId: Int,
    @StringRes val desc: Int
)

val laws = listOf(
    Law(R.string.law_1_title, R.string.law_1_subTitle, R.drawable.image_law_1, R.string.law_1_desc),
    Law(R.string.law_2_title, R.string.law_2_subTitle, R.drawable.image_law_2, R.string.law_2_desc),
    Law(R.string.law_3_title, R.string.law_3_subTitle, R.drawable.image_law_3, R.string.law_3_desc),
    Law(R.string.law_4_title, R.string.law_4_subTitle, R.drawable.image_law_4, R.string.law_4_desc),
    Law(R.string.law_5_title, R.string.law_5_subTitle, R.drawable.image_law_5, R.string.law_5_desc),
    Law(R.string.law_6_title, R.string.law_6_subTitle, R.drawable.image_law_6, R.string.law_6_desc),
    Law(R.string.law_7_title, R.string.law_7_subTitle, R.drawable.image_law_7, R.string.law_7_desc),
    Law(R.string.law_8_title, R.string.law_8_subTitle, R.drawable.image_law_8, R.string.law_8_desc),
    Law(R.string.law_9_title, R.string.law_9_subTitle, R.drawable.image_law_9, R.string.law_9_desc),
    Law(R.string.law_10_title, R.string.law_10_subTitle, R.drawable.image_law_10, R.string.law_10_desc),

    Law(R.string.law_11_title, R.string.law_11_subTitle, R.drawable.image_law_11, R.string.law_11_desc),
    Law(R.string.law_12_title, R.string.law_12_subTitle, R.drawable.image_law_12, R.string.law_12_desc),
    Law(R.string.law_13_title, R.string.law_13_subTitle, R.drawable.image_law_13, R.string.law_13_desc),
    Law(R.string.law_14_title, R.string.law_14_subTitle, R.drawable.image_law_14, R.string.law_14_desc),
    Law(R.string.law_15_title, R.string.law_15_subTitle, R.drawable.image_law_15, R.string.law_15_desc),
    Law(R.string.law_16_title, R.string.law_16_subTitle, R.drawable.image_law_16, R.string.law_16_desc),
    Law(R.string.law_17_title, R.string.law_17_subTitle, R.drawable.image_law_17, R.string.law_17_desc),
    Law(R.string.law_18_title, R.string.law_18_subTitle, R.drawable.image_law_18, R.string.law_18_desc),
    Law(R.string.law_19_title, R.string.law_19_subTitle, R.drawable.image_law_19, R.string.law_19_desc),
    Law(R.string.law_20_title, R.string.law_20_subTitle, R.drawable.image_law_20, R.string.law_20_desc),

    Law(R.string.law_21_title, R.string.law_21_subTitle, R.drawable.image_law_21, R.string.law_21_desc),
    Law(R.string.law_22_title, R.string.law_22_subTitle, R.drawable.image_law_22, R.string.law_22_desc),
    Law(R.string.law_23_title, R.string.law_23_subTitle, R.drawable.image_law_23, R.string.law_23_desc),
    Law(R.string.law_24_title, R.string.law_24_subTitle, R.drawable.image_law_24, R.string.law_24_desc),
    Law(R.string.law_25_title, R.string.law_25_subTitle, R.drawable.image_law_25, R.string.law_25_desc),
    Law(R.string.law_26_title, R.string.law_26_subTitle, R.drawable.image_law_26, R.string.law_26_desc),
    Law(R.string.law_27_title, R.string.law_27_subTitle, R.drawable.image_law_27, R.string.law_27_desc),
    Law(R.string.law_28_title, R.string.law_28_subTitle, R.drawable.image_law_28, R.string.law_28_desc),
    Law(R.string.law_29_title, R.string.law_29_subTitle, R.drawable.image_law_29, R.string.law_29_desc),
    Law(R.string.law_30_title, R.string.law_30_subTitle, R.drawable.image_law_30, R.string.law_30_desc),

    Law(R.string.law_31_title, R.string.law_31_subTitle, R.drawable.image_law_31, R.string.law_31_desc),
    Law(R.string.law_32_title, R.string.law_32_subTitle, R.drawable.image_law_32, R.string.law_32_desc),
    Law(R.string.law_33_title, R.string.law_33_subTitle, R.drawable.image_law_33, R.string.law_33_desc),
    Law(R.string.law_34_title, R.string.law_34_subTitle, R.drawable.image_law_34, R.string.law_34_desc),
    Law(R.string.law_35_title, R.string.law_35_subTitle, R.drawable.image_law_35, R.string.law_35_desc),
    Law(R.string.law_36_title, R.string.law_36_subTitle, R.drawable.image_law_36, R.string.law_36_desc),
    Law(R.string.law_37_title, R.string.law_37_subTitle, R.drawable.image_law_37, R.string.law_37_desc),
    Law(R.string.law_38_title, R.string.law_38_subTitle, R.drawable.image_law_38, R.string.law_38_desc),
    Law(R.string.law_39_title, R.string.law_39_subTitle, R.drawable.image_law_39, R.string.law_39_desc),
    Law(R.string.law_40_title, R.string.law_40_subTitle, R.drawable.image_law_40, R.string.law_40_desc),

    Law(R.string.law_41_title, R.string.law_41_subTitle, R.drawable.image_law_41, R.string.law_41_desc),
    Law(R.string.law_42_title, R.string.law_42_subTitle, R.drawable.image_law_42, R.string.law_42_desc),
    Law(R.string.law_43_title, R.string.law_43_subTitle, R.drawable.image_law_43, R.string.law_43_desc),
    Law(R.string.law_44_title, R.string.law_44_subTitle, R.drawable.image_law_44, R.string.law_44_desc),
    Law(R.string.law_45_title, R.string.law_45_subTitle, R.drawable.image_law_45, R.string.law_45_desc),
    Law(R.string.law_46_title, R.string.law_46_subTitle, R.drawable.image_law_46, R.string.law_46_desc),
    Law(R.string.law_47_title, R.string.law_47_subTitle, R.drawable.image_law_47, R.string.law_47_desc),
    Law(R.string.law_48_title, R.string.law_48_subTitle, R.drawable.image_law_48, R.string.law_48_desc)
)