package com.regera.RestfulApi.datasource.mock

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class MockBankDataSourceTest
{
    private val mockDataSource = MockBankDataSource()

    @Test
    fun `should a collection of banks`(){

    //given


    //when
        val banks = mockDataSource.getBanks()
    //then

      //  assertThat(banks.size).isGreaterThanOrEqualTo(3)
        assertThat(banks).isNotEmpty
    }
    
    @Test
    fun `should provide some data`(){
    
    //given
    
    
    //when
    val banks = mockDataSource.getBanks()
    
    //then
    assertThat(banks).anyMatch() { it.accountNumber.isNotBlank() }
        assertThat(banks).anyMatch() { it.trust != 0.0 }
        assertThat(banks).anyMatch() { it.transactionFee != 0 }


    }
}