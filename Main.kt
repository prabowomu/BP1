fun main (){

    val bowo : Human = Human("Bowo")
    val andi : Human = Human("Andi")

    bowo.email = "prabowo.1339@students.amikom.ac.id"
    bowo.address = "jln surya permata IV"

    andi.email = "haha@gmail.com"
    andi.address = "jln.kaliurang km 100"

    bowo.talk()
    andi.talk()

    bowo.introduce()
    andi.introduce()

    println(bowo.verify("prabowo.1339@students.amikom.ac.id"))

    println(bowo.name)

    val ardi : Bowo = bowo
    println(ardi.kenegaraan)
}