package site.cjserrano.basiclayouts.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import site.cjserrano.basiclayouts.R

data class AlignYourBody(
    @StringRes val text : Int,
    @DrawableRes val drawable: Int
)

val alignYourBodyData = listOf(
    AlignYourBody(R.string.ab1_inversions, R.drawable.ab1_inversions),
    AlignYourBody(R.string.ab2_quick_yoga, R.drawable.ab2_quick_yoga),
    AlignYourBody(R.string.ab3_stretching, R.drawable.ab3_stretching),
    AlignYourBody(R.string.ab4_tabata, R.drawable.ab4_tabata),
    AlignYourBody(R.string.ab5_hiit, R.drawable.ab5_hiit),
    AlignYourBody(R.string.ab6_pre_natal_yoga, R.drawable.ab6_pre_natal_yoga),
    AlignYourBody(R.string.fc1_short_mantras, R.drawable.fc1_short_mantras),
    AlignYourBody(R.string.fc2_nature_meditations, R.drawable.fc2_nature_meditations),
    AlignYourBody(R.string.fc3_stress_and_anxiety, R.drawable.fc3_stress_and_anxiety),
    AlignYourBody(R.string.fc4_self_massage, R.drawable.fc4_self_massage),
    AlignYourBody(R.string.fc5_overwhelmed, R.drawable.fc5_overwhelmed),
    AlignYourBody(R.string.fc6_nightly_wind_down, R.drawable.fc6_nightly_wind_down)
)
