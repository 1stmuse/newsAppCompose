package com.loc.newsapp.domain.useCases

import com.loc.newsapp.domain.manager.LocalUserManager
import kotlinx.coroutines.flow.Flow

class ReadAppEntry(private val localUserManage: LocalUserManager) {

     operator fun invoke(): Flow<Boolean>{
        return localUserManage.readAppEntry()
    }
}