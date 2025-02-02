package com.caique.navigations.command

import androidx.navigation.NamedNavArgument

abstract class NavigationCommand {

    open val basicArgs: List<NamedNavArgument> = emptyList()
    abstract val destination: String
}