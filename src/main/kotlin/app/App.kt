package app

import utils.CalcUtils

class App {

    fun run() {
        printHeader()
        calculate()
    }

    private fun printHeader() {
        println("=====================")
        println("Simple Calc App!")
        println("=====================")
    }

    private fun calculate(){
        val calcUtils = CalcUtils()
        println(calcUtils.plus(10,10))
        println(calcUtils.minus(10,10))
        println(calcUtils.divide(10,10))
        println(calcUtils.multiply(10,10))
    }

    companion object{
        @JvmStatic
        fun main(args : Array<String>){
            val app = App()
            app.run()
        }
    }
}