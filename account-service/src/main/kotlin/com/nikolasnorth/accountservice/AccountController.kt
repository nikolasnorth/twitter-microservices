package com.nikolasnorth.accountservice

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/accounts")
class AccountController {

    @GetMapping("{id}")
    @ResponseStatus(HttpStatus.OK)
    fun getAccountById(@PathVariable id: String) {
    }

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    fun createAccount() {
    }

    @PutMapping("{id}")
    @ResponseStatus(HttpStatus.OK)
    fun updateAccountById(@PathVariable id: String) {
    }

    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.OK)
    fun deleteAccountById(@PathVariable id: String) {
    }
}
