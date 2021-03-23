package org.xplain.services.courses

import io.micronaut.runtime.Micronaut.*
fun main(args: Array<String>) {
	build()
	    .args(*args)
		.packages("org.xplain.services.courses")
		.start()
}

