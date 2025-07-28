package org.carlosacademic.springkotlinesentials.poo.accessModifiers

class A {

    private val privateMember: Int = 1
    protected val protectedMember: String = "2"
    internal val internalMember: Double = 3.0
    val publicMember = 4

    private fun privateMethod() = 5
    protected fun protectedMethod() = 6
    internal fun internalMethod() = 7
    fun publicMethod() = 8
}