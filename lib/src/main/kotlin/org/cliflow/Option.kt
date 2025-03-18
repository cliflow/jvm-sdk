package org.cliflow;

@Target(Annotation.FIELD)
@Retention(AnnotationRetention.RUNTIME)
annotation class Option(
    val name: String,
    val aliases: Array<String> = emptyArray(),
    val usage: String = "",

    val metaVar: String = "",

    var help: Boolean = false,

    val hidden: Boolean = false,
)