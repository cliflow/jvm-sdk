package org.cliflow

import java.util.ArrayList

public class Config {
    val options: MutableList<ConfigElement> = ArrayList()

    val arguments: MutableList<ConfigElement> = ArrayList()

    inner class ConfigHelper(private val config: Config): DefaultHandler() {
        private var currentCE : ConfigElement? = null

        @Throws(SAXException::class)
        override fun startElement(uri: String, localName: String, qName: String, attributes: Attributes) {
            if (qName == "option" || qName == "argument") {
                currentCE = ConfigElement().apply {

                }
            }
        }
    }

    companion object {
        fun parseConfig(xml: InputSource): Config {

        }
    }
}