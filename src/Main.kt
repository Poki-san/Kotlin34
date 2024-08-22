//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("Задание 1")
    val name = "12.3"
    println(name+" - ${name.javaClass.name}")
    println("${name.toDouble().toInt()} - ${name.toDouble().toInt().javaClass.name}")
    println("${name.toDouble()} - ${name.toDouble().javaClass.name}")
    println(name.toDouble().toInt().toString(2)+" - ${name.toDouble().toInt().javaClass.name}")

    println("\nЗадание 2")
    checkType(123)
    checkType("Привет")
    checkType('П')
    checkType(12.3)

    println("\nЗадание 3")
    sum(arrayOf(1,2,3))
    sum("Дела")
    sum(3)
}

fun <T> checkType(n:T){
    when(n){
        is Int-> println("Это целое число")
        is Double-> println("Это число с плавающей точкой")
        is String-> println("Это строка")
        is Char-> println("Это символ")
    }
}

fun <T> sum(n:T){
    when(n){
        is Int -> println(n+1)
        is String -> println(n.length+1)
        is Array<*> -> {
            if (n.all { it is Int }) println(n.filterIsInstance<Int>().sum())
            else println("Это массив не целых чисел")
        }
    }
}