import java.nio.file.attribute.UserDefinedFileAttributeView
import java.util.ArrayList

fun main() {
    //variable
    /*
    val firstname1 = "Bowo"
    val lastname1 = "1339"
    val age1 = 19
    println(firstname1)
    println(lastname1)
    println(age1)

    val firstname2="Rudi"
    val lastname2="Setiawan"
    val age2 = 25
    println(firstname2)
    println(lastname2)
    println(age2)
     */

    //array
    /*
    val firstname = arrayListOf<String>()
    val lastname = arrayListOf<String>()
    val age = arrayListOf<Int>()

    firstname.add("Bowo")
    lastname.add("Utomo")
    age.add(19)

    firstname.add("Rudi")
    lastname.add("Setiawan")
    age.add(25)

    for (first in firstname) {
        println(first)
    }
    for (last in lastname) {
        println(last)
    }
    for (a in age){
        println(a)
    }
     */

    //array2
/*
    val andiarray = arrayListOf<Any>()
    andiarray.add("Andi")
    andiarray.add("Budiman")
    andiarray.add(34)
    for (andi in andiarray) {
        println(andi)
    }

 */

    //array 3
    /*
    val mhsarray = arrayListOf<ArrayList<Any>>()
    mhsarray.add(andiarray)
    mhsarray.add(arrayListOf("Rudi", "Setiawan", 34))
    for (item in mhsarray) {
        for (i in item) {
            println(i)
        }
    }
 */

    //data class
    val andi = User(firstname = "Andi", lastname = "Setiawan", age = 34)
    val rudi = User(age = 25, firstname = "Rudi", lastname = "Budiman")
    val dedi =User()
    dedi.age = 35
    dedi.firstname="Dedi"

    val andi2 = andi.copy(age = 40)

    println(andi)
    println(rudi)
    println(dedi)

    println(andi.lastname)
    println(andi2)

    //dataclass array
    val mhsamikom = arrayListOf<User>()
    mhsamikom.add(andi)
    mhsamikom.add(rudi)
    mhsamikom.add(dedi)

    mhsamikom.add(User(firstname = "Ferdi", lastname = "Setiawan", age = 45))

    for (mhs in mhsamikom)
        println(mhs)
}
