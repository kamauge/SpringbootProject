package com.regera.RestfulApi.datasource

import com.regera.RestfulApi.models.Bank

interface BankDataSource {

  fun getBanks():Collection<Bank>
}