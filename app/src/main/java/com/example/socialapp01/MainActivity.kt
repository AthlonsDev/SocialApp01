package com.example.socialapp01

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    val apiKeys = "UKLDfNgjaCoLMHbTNjB8hnBAx"
    val apiSecret = "xMHvLSnbh3ZlNFz11Avk7iPgYm0py6AJBbUGuI5BfYC4JnM93Z"
    val bearerToken = "AAAAAAAAAAAAAAAAAAAAAJKLbwEAAAAAuc0omzjnh5XkR0IsSVb%2BXHcoEsc%3DqeJcSp8JRiZKLHcTguGvXS0kQwWOHMRpGCdet8dnpKEyBHWwXf"
    val clientID = "VE9JcGxzbWR0SC1RVVVabDhWWkU6MTpjaQ"
    val clientSecret = "Cj8c9r--bgWBAJR7Nbolji3TWoQFSYM3i02qM6Qv50ak2zwez5"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        signInTwitter()
        searchForTweets()
    }

    fun signInTwitter() {


    }

    fun searchForTweets() {

    }

}