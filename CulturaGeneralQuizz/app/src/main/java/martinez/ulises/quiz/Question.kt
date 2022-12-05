package martinez.ulises.quiz

import androidx.annotation.StringRes

data class Question(@StringRes val textResId:Int, val respuesta:Boolean)