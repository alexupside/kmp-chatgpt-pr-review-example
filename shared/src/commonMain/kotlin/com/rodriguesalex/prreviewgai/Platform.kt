package com.rodriguesalex.prreviewgai

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform