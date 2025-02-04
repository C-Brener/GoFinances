package com.caique.navigations.routes.login

import com.caique.navigations.manager.NavigationManager
import com.caique.navigations.navigations.login.LoginNavigation
import com.caique.routes.login.LoginActionInterface

class LoginActionImpl(private val navigationManager: NavigationManager) : LoginActionInterface {
    override fun navigateToLogin() {
        navigationManager.navigate(
            LoginNavigation.root
        )
    }
}