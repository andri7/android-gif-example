package burrows.apps.example.gif.data.rest.model

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test
import test.TestBase

/**
 * @author [Jared Burrows](mailto:jaredsburrows@gmail.com)
 */
class ResultDtoTest : TestBase() {
  private val TEST_MEDIAS = arrayListOf<MediaDto>()
  private var sut = ResultDto().apply { media = TEST_MEDIAS; title = STRING_UNIQUE }

  @Test fun testGetMedia() {
    assertThat(sut.media).isEqualTo(TEST_MEDIAS)
  }

  @Test fun testGetTitle() {
    assertThat(sut.title).isEqualTo(STRING_UNIQUE)
  }
}
