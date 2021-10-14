package com.example.myapp

import kotlin.concurrent.thread

/**
 * Here, the main function waits for the background thread till it finishes its work
 */

fun main (){   /** Executes in main thread**/
    println("Main program starts : ${Thread.currentThread().name}")

    /**Create a background thread**/
    thread {
          println("Work starts : ${Thread.currentThread().name}")  /**Name of this thread**/

        Thread.sleep(1000)  /**Doing something which will last 1000ms, perhaps getting data from database**/
        println("Work finished : ${Thread.currentThread().name}")
    }

    /**Block the main thread, wait for the background thread till it finishes**/
    Thread.sleep(2000)

    /**Other code**/
    println("Main program ends : ${Thread.currentThread().name}")
}