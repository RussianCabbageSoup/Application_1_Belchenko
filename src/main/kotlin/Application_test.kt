fun main() {

    println("Hello World!");

    var Value1 = 1;
    println(Value1);

    Value1 = 5 * 2;
    println(Value1);

    Value1 = Value1/3;
    println(Value1);

    println();

    var arr = arrayOf("1", 2, false, "Any");
    arr.forEach { print(it.toString() + "\t") }
    println("\n");
}