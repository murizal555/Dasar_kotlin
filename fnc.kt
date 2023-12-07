fun main(){
    val user=setUser("mumu",23)
    println(user)
    printUser("mumu")
}
fun setUser(name:String,age: Int) ="nama kmu $name, umurmu $age"
fun printUser(name:String){
    println("your name is $name")
}