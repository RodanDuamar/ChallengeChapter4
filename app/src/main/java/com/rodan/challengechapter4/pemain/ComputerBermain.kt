package com.rodan.challengechapter4.pemain

import kotlin.random.Random

object ComputerBermain {

    private val caraBermain = mapOf(
        "BATU-GUNTING" to true,
        "BATU-KERTAS" to false,
        "GUNTING-KERTAS" to true,
        "KERTAS-BATU" to true,
        "KERTAS-GUNTING" to false,
    )

    private val opsi = listOf("BATU", "GUNTING", "KERTAS")



    fun opsiRandom(): String = opsi[Random.nextInt(0,3)]

    fun seri(pemain1: String,computer : String): Boolean = pemain1 == computer

    fun menang(pemain1: String, computer: String): Boolean = caraBermain["$pemain1-$computer"]!!
}