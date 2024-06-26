package com.joon.kopring.dto.response

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.PropertyNamingStrategies
import com.fasterxml.jackson.databind.annotation.JsonNaming
import com.joon.kopring.dto.request.UserRequest

data class UserResponse(
    var result: Result? = null,
    var description: String? = null,

    @JsonProperty("user")
    var userRequest: MutableList<UserRequest>? = null
)

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy::class)
data class Result(
    var resultCode: String? = null,
    var resultMessage: String? = null
)