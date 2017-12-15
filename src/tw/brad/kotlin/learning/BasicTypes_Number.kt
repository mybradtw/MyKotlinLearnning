package tw.brad.kotlin.learning

fun main(args: Array<String>){
    val n1 : Byte   // 宣告 n1 為一個常數, 資料型態為 Byte, 尚未進行初始化
    n1 = 127        // 整數數值範圍: -128 ~ 127, 不可以超出範圍
    println(n1)

    val n2 : Byte = -128    // 宣告的同時, 直接進行初始化
    println(n2)

    val n3 : Short = 32767  // 整數數值範圍 -32768 ~ 32767
    //val n4 : Short = n1     // 不同資料型態之間, 無法直接隱含轉型
    val n4 : Short = n3
    println(n4)

    val n5 : Int = 123
    val n6 = 327688     // 沒有指定資料型態的時候, 預設為 Int
    val n7 = n1         // 如果初始化給值的資料型態, 決定其資料型態
    val n8 = 127        // 任何整數數值為 Int 的資料型態

    var n9 = n1 + n5    // 不同資料型的資料內容可以進行數學運算

    println(n9.javaClass.name)      // 顯示相當於 Java 中的資料型態
    println(n9.javaClass.kotlin)    // 顯示 Kotlin 中的資料型態
    println("n9 => " + n9.javaClass.kotlin.qualifiedName)
    println("n1 => " + n1.javaClass.kotlin.qualifiedName)
    println("n5 => " + n5.javaClass.kotlin.qualifiedName)

    val n10 = 1.2
    println("n10 => " + n10.javaClass.kotlin.qualifiedName)
    val n11: Double = 1.2
    println("n11 => " + n11.javaClass.kotlin.qualifiedName)

    val n12 = 1.2F
    println("n12 => " + n12.javaClass.kotlin.qualifiedName)
    val n13: Float = 1.2F
    println("n13 => " + n13.javaClass.kotlin.qualifiedName)


}