package org.xplain.services.lessons

import io.micronaut.runtime.Micronaut.*
fun main(args: Array<String>) {
	build()
	    .args(*args)
		.packages("org.xplain.services.lessons")
		.start()
}

