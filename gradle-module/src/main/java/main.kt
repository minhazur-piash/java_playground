import java.time.Instant
import java.time.LocalDate
import java.time.ZoneId
import java.time.temporal.ChronoUnit
import java.util.regex.Pattern


fun main(args: Array<String>) {

    val message = "<#> Welcome to Village+, Jacob! Your confirmation code is aaaa.\n" +
            "4SQGRT+/TMy"

    val regex = "(?<=code is )[\\w\\d]*(?=\\.)"
    val pattern = Pattern.compile(regex)
    val matcher = pattern.matcher(message)
    if (matcher.find()) {
        println("===> ${matcher.group()}")
    }


    val values: HashMap<String, String> = HashMap<String, String>()
    values["hey"] = "yo"
    println(values)


    /*val date1: Date = SimpleDateFormat("yyyy-MM-dd").parse("2020-11-24T23:59:59")
    println(date1.toInstant().toEpochMilli())*/


    val fixedDate = 1607536800000
    val date = Instant.ofEpochMilli(fixedDate)
            .atZone(ZoneId.systemDefault())
            .toLocalDate()
            .atStartOfDay()
            .plusDays(1)


    println(date)
    println(LocalDate.now().atStartOfDay())

    val between = ChronoUnit.DAYS.between(date, LocalDate.now().atStartOfDay())
    println("===> missed days: $between")

    val person = Person("name")
    callback(object : Callback {
        override fun called() {
            println("callback")
        }
    })

    val items: MutableList<Int>? = mutableListOf(1, 2)
    println(isTrue(items))
    updateItems(items?.toMutableList())
    println(items)
}

fun updateItems(items: MutableList<Int>?) {
    items?.add(3)
}

fun isTrue(values: List<Int>?): Boolean {
    return values?.let {
        it.size > 1
    } ?: false
}

fun callback(callback: Callback) {
    callback.called()
}

class Person constructor(private val name: String) {

}


interface Callback {
    fun called()
}