fun main() {
    school()
    println(ageName("Rayan",23))
    println(sentence("we are in AkiraChix"))
    println(condition("kambua"))
    println(condition("Philip"))
}
fun school (){
    var identity= "AkiraChix"
    println(identity[0])
    println(identity[3])
    println(identity[4])
}
fun ageName(name:String,age:Int):String{
    return "Hi, my name is $name and i am $age years old"
}
fun sentence(sentence:String): String{
    return "Sentence length:"+sentence.length
}
fun condition(name:String){
    var mane = "Philip"
    if(name.equals(mane)){
        println("Thats Me!")
    }else{
        println("I dont know what that is")
    }
}
