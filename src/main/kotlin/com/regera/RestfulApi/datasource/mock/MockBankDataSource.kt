package com.regera.RestfulApi.datasource.mock

import com.regera.RestfulApi.datasource.BankDataSource
import com.regera.RestfulApi.models.Bank
import org.springframework.stereotype.Repository

@Repository
class MockBankDataSource : BankDataSource {
    val banks = listOf(Bank("5656",1.0,5))
    override fun getBanks(): Collection<Bank> {
        return banks
    }
}