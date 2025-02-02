package com.caique.navigations.manager

import androidx.navigation.NavDirections
import androidx.navigation.NavHostController
import com.caique.navigations.command.NavigationCommand
import kotlinx.coroutines.flow.MutableStateFlow

class NavigationManager {
    private val commands: MutableStateFlow<NavigationCommand?> = MutableStateFlow(null)

    suspend fun setup(navHost: NavHostController) {
        commands.collect { command ->
            if (command?.destination?.isNotEmpty() == true){
                navHost.navigate(command.destination)
            }
        }

    }

//    fun navigate(directions: NavigationCommand){
//        commands.value = dir
//    }
}

