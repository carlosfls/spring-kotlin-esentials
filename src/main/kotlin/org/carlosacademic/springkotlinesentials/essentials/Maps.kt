package org.carlosacademic.springkotlinesentials.essentials

fun main() {
    val capitalsMap = mapOf(
       "Spain" to "Madrid",
        "Portugal" to "Lisbon",
        "France" to "Paris"
    )

    val capitalsMutable = mutableMapOf<String, String>(
        "Spain" to "Madrid",
        "Portugal" to "Lisbon",
        "France" to "Paris"
    )

    capitalsMutable.put("Germany", "Berlin")

    val countries = capitalsMap.keys
    val capitals = capitalsMap.values

    println(countries)
    println(capitals)
    println(capitalsMap["Spain"])

    capitalsMap.containsKey("Germany")
    capitalsMap.containsValue("Berlin")
}