// COMP2850 Portfolio: Week 3
// Tests for median()

import io.kotest.core.spec.style.FreeSpec
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.matchers.shouldBe
import io.kotest.matchers.floats.plusOrMinus

const val tolerance = 0.000001f

@Suppress("Unused")
class MedianTest : FreeSpec({
    "Exception when size=0" {
        shouldThrow<IllegalArgumentException> {
            median(listOf())
        }
    }

    // Write four more tests here
    "Median of a list with one element" {
        median(listOf<Float>(5.0f)) shouldBe 5.0f
    }

    "Median of a list with two elements" {
        median(listOf<Float>(1.0f, 3.0f)) shouldBe 2.0f
    }

    "Median of a list with three elements" {
        median(listOf<Float>(1.0f, 2.0f, 3.0f)) shouldBe 2.0f
    }

    "Median of a list with four elements" {
        median(listOf<Float>(1.0f, 2.0f, 3.0f, 4.0f)) shouldBe 2.5f
    }
})
