package com.example.navigationdrawer

sealed class Screens(val screen:String){
    data object Home: Screens("home")
    data object Profile: Screens("profile")
    data object Settings: Screens("settings")

}