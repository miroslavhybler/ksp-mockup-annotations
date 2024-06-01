@file:Suppress(
    "RedundantVisibilityModifier",
    "RemoveEmptyPrimaryConstructor",
    "unused",
    "RedundantConstructorKeyword"
)

package mir.oslav.mockup.annotations


/**
 * Annotates class's property to be skipped during generating mockup data
 * @author Miroslav Hýbler<br>
 * created on 01.06.2024
 * @since 1.1.6
 */
@Target(AnnotationTarget.PROPERTY)
@Retention(AnnotationRetention.SOURCE)
@MustBeDocumented
public annotation class IgnoreOnMockup constructor() {
}