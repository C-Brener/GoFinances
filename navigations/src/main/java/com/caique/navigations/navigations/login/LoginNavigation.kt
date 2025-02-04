package com.caique.navigations.navigations.login

import com.caique.navigations.command.NavigationCommand

object LoginNavigation {
    val root = object : NavigationCommand() {
        override val destination = "login_screen"
    }

    val register = object : NavigationCommand() {
        override val destination = "register_screen"
    }
}