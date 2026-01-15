//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
//    val a = 5
//    val b = 4
//    if (a > b) {
//        println("a is greater then b")
//    } else {
//        ("a is not greater then b")
//    }(
//    val x=6
//    val y=3
//    if (x==y) {
//        println("x=y")
//    }else{("x and y not equal")
//    }
//    print("enter value a:")
//    val a = readLine()!!.toInt ()
//    print("enter value b:")
//    val b = readLine ()!!.toInt()
//    if (a==b) {
//        println("a and b equal")
//    }else{
//            println("a and  not equal")
//        }
//print("enter the number a:")
//    val a = readLine()!!.toInt()
//    print("enter the number b:")
//    val b = readLine()!!.toInt()
//    print("enter the number c:")
//val c = readLine()!!.toInt()
//if(a<b && a<c)
//{
//    println("$a is the smallest number")
//
//}
//    else if(b<a && b<c)
//{
//        println("$b is the smallest number")
//
//}
//    else{
//        println($"c is the smallest number")
//
//    }
    //when operators
//   print("Enter your grade")
//    val grade=readLine()!!.trim().toInt()
//    when(grade){
//        in 80..100->print("your result A+")
//        in 70..79->print("your result is A")
//        in 55..78->print("your result is B")
//        else->print("Fail")
//    }
// created calculator
//    println(" enter frist number");
//    val a = readLine()!!.toDouble()
//    println("enter second number");
//    val b = readLine()!!.toDouble()
//    println("enter Operator +,_,*,/,->");
//    val operator = readLine()!!
//    val result = when (operator) {
//        "+" -> a + b
//        "_" -> a - b
//        "*" -> a * b
//        "/" -> if (b != 0.00) {
//            a / b
//            return
//        } else {
//            println(" can not devide by zero")
//            return
//
//        }
//
//        else -> {
//            println("invaild operator")
//            return
//        }
//    }
//    println(result)
    //three element summation
//    println("enter frist number")
//    val a = readLine()!!.toDouble()
//    println("enter second number")
//    val b = readLine()!!.toDouble()
//    println("enter third number")
//    val c = readLine()!!.toDouble()
//    if(a+b+c==180.00)
//    {
//        println("you are right")
//
//    }
//    else {
//        println("wrong")
//    }
//    println("enter the number")
//    val a=readLine()!!.toDouble()
//    if(a%5.0==0.0 && a%11.0==0.0)
//    {
//        println("neither")
//    }
//        if(a%5.0==0.0||a%11.0==0.0) {
//
//
//            println("neither")
//        }
//    else
//        {
//            println("eaither")
//        }
//    println("enter the unit")
//    val unit = readLine()!!.toInt()
//    if (unit <= 100) {
//        println("${unit*5}")
//    } else if (unit <= 100) {
//        println("${100 * 5)+(unit - 100)* 7}")
//    } else {
//        println("no bill")
//    }
//    var i = 0
//    while (i < 8) {
//
//        ++i
//        println(i)
//    }
//    var a=readLine()!!.toInt()
//    var i =0
//    while(i<10){
//        i++
//
//        println(a*i)
//    }
//    var a = readLine()!!.toInt()
//
//    while (a != 30) {
//
//        if (a %2!=0 ) {
//            println("the numer $a is odd ")
//        }


//    }
//    println("enter the number")
//    var n =readLine ()!!.trim().toInt()
//    println("enter Second number")
//    var i=readLine ()!!.trim().toInt()
//    while(i<=n) {
//        if (i % 2 == 0)
//            println("$i is Even")
//        else println("$i is odd")
//        i++
//    }
//    val startprogram=true
//    if(startprogram)
//    {
//        println("program stared\n")
//        for(i in 1..20)
//        {println("for loop :$i")
//            var j=1
//            println("while loop :")
//
//            while (j<=i){
//                println("$j")
//                j++
//            }
//            println("\n")
//
//        }
//
//    }else{
//        println("program not stared")
//    }    }
//    val examActive=true
//    if(examActive){
//        println("exam processing started\n")
//        for(student in 1..3) {
//            val marks = student * 25
//            println("student$student Marks:$marks")
//            if (marks >= 40) {
//                println("status:pass")
//
//            } else {
//                println("student fail")
//            }
//            var count = 10
//            println("marks counting")
//            while (count <= marks) {
//                print("$count")
//                count += 10
//
//            }
//            println("\n")
//        }
//        else
//        }
//            println("exam not active")
//


    //
//    println("== 0 Array===")
//
//    val numbersArray = arrayOf(50, 20, 45, 40)
//
//    println("Array :${numbersArray.joinToString()}")
//
//    println("Frist element:${numbersArray[0]}")
//
//    println("Last element:${numbersArray[numbersArray.size - 3]}")
//
//    //updating array element
//    numbersArray[1] = 36
//
//    println("After updating 4th element:${numbersArray.joinToString()}")
//}
//    val R: Double = readLine()!!.toDouble()
//    val pi:Double=3.14159
//
//    val A:Double=pi*R*R
//
//    println("A=${"%.4f".format(A)}")
//}
//val A:Int=readLine()!!.toInt()
//    val B:Int=readLine()!!.toInt()
//    val sum:Int=A+B
//
//
//    println("SOMA = $sum")
//val a :Int=readLine()!!.toInt()
//    val b:Int=readLine()!!.toInt()
//    val PROD:Int=a*b
//    println("PROD=PROD")


//    //09
//    val name = readLine()!!.toString()
//
//    val salary = readLine()!!.toDouble()
//
//    val productSold = readLine()!!.toDouble()
//
//    val commission = (productSold*15)/100
//
//    val finalSalary = salary + commission
//
//    println(" Total = R${"%.2f".format(finalSalary)}")
//008

//
    val code1 = readLine()!!.toInt()
    val code2 = readLine()!!.toInt()
    val unit = readLine()!!.toInt()



}












