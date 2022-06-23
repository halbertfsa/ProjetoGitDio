public class Pessoa {

    var name: String = ""
    var sobreName: String = ""


}

class main {

    val pessoa1 =Pessoa()
    val pessoa2 =Pessoa()
    val pessoa3 =Pessoa()
    pessoa1.name = "Halbert"
    pessoa1.sobreName = " Nascimento"
    pessoa2.name = "Wendy"
    pessoa2.sobreName = " Santos"
    pessoa3.name = "Gamora"
    pessoa3.sobreName = " Santos"


    print(pessoa1.name)
    //print(pessoa1.cpf)
    println(pessoa1.sobreName)
    print(pessoa2.name)
    println(pessoa2.sobreName)
    print(pessoa3.name)
    println(pessoa3.sobreName)
}