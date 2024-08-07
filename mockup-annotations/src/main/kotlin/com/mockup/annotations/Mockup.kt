@file:Suppress("RedundantConstructorKeyword", "unused", "RedundantVisibilityModifier")

package com.mockup.annotations

import androidx.annotation.IntRange


/**
 * Annotates desired class for mockup data generation.
 * @param count Number of items generated, keep it low for better performance and less memory consumption.
 * @param enableNullValues True if you want to allow random null values on nullable properties, false otherwise.
 * @param name Name of mockup data provider property in generated Mockup.kt object. If empty, class name
 * is used instead, e.g for class <b>User</b> you will access mockup data like this: <code>Mockup.user.single</code>
 * @since 1.0.0
 * @author Miroslav Hýbler <br>
 * created on 15.09.2023
 */
@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.SOURCE)
@MustBeDocumented
public annotation class Mockup constructor(
    @IntRange(from = 1, to = 256)
    val count: Int = 10,
    val enableNullValues: Boolean = false,
    val name: String = "",
) {

}