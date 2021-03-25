package org.xplain.services.core

import io.micronaut.runtime.Micronaut.*
fun main(args: Array<String>) {
	build()
	    .args(*args)
		.packages("org.xplain.services.core")
		.start()
}

