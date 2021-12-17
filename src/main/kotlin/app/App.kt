package app

import utils.CalcUtils

class App {

    fun run() {
        printHeader()
        inputValue()
    }

    private fun printHeader() {
        println("=====================")
        println("Simple Calc App!")
        println("=====================")
    }

    private fun inputValue(){
        println("First input :")
        val firstInput = readLine()?.toInt()?:0
        println("Second input :")
        val secondInput = readLine()?.toInt()?:0
        println("Please select the operator")
        println("+")
        println("-")
        println("/")
        println("*")
        val operator = readLine().toString()
        calculate(firstInput,secondInput,operator)
    }

    private fun calculate(a:Int,b:Int,operator:String){
        val calcUtils = CalcUtils()
        when(operator.lowercase()){
            "+"      -> println("Result for plus is ${calcUtils.plus(a,b)}")
            "-"      -> println("Result for minus is ${calcUtils.minus(a,b)}")
            "/"      -> println("Result for divide is ${calcUtils.divide(a,b)}")
            "x"      -> println("Result for multiply is ${calcUtils.multiply(a,b)}")

            else -> {
                println("Please choose the right operator")
            }
        }
    }

    companion object{
        @JvmStatic
        fun main(args : Array<String>){
            val app = App()
            app.run()
        }
    }
}