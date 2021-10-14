package com.example.myapp

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.concurrent.thread

fun main (){   /** Executes in main thread**/

    runBlocking {
        println("Main program starts : ${Thread.currentThread().name}")

        /**Create a background coroutine that runs on a background thread
         * GlobalScope create a child coroutine in background thread
         */
        GlobalScope.launch {
            println("Work starts : ${Thread.currentThread().name}")  //Thread T1
            /**Name of this thread**/

            mySuspendFunction(1000) //Suspends the coroutine but T1 is not blocked

            /**Doing something which will last 1000ms, perhaps getting data from database**/
            /**Doing something which will last 1000ms, perhaps getting data from database**/
            println("Work finished : ${Thread.currentThread().name}")
        }

        /**Create a coroutine that blocks the current main thread**/
            mySuspendFunction(2000)  //main thread : Waits for coroutine to finish its tasks

        /**Other code**/
        println("Main program ends : ${Thread.currentThread().name}")  //main thread
    }
}

suspend fun mySuspendFunction(time : Long){
    delay(time)
}