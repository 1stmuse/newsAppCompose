package com.loc.newsapp.domain.useCases.app_entry

import com.loc.newsapp.domain.manager.LocalUserManager

class SaveAppEntry(private val localUserManage: LocalUserManager) {

    suspend operator fun invoke(){
        localUserManage.saveAppEntry()
    }
}