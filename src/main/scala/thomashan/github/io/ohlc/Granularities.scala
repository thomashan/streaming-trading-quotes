package thomashan.github.io.ohlc

import java.time.temporal.TemporalAmount

import scala.time._

object Granularities {

  sealed abstract class Granularity(duration: TemporalAmount)

  case object S1 extends Granularity(1.second)

  case object S5 extends Granularity(5.seconds)

  case object S10 extends Granularity(10.seconds)

  case object S15 extends Granularity(15.seconds)

  case object S30 extends Granularity(30.seconds)

  case object M1 extends Granularity(1.minute)

  case object M2 extends Granularity(2.minutes)

  case object M4 extends Granularity(4.minutes)

  case object M5 extends Granularity(5.minutes)

  case object M10 extends Granularity(10.minutes)

  case object M15 extends Granularity(15.minutes)

  case object M30 extends Granularity(30.minutes)

  case object H1 extends Granularity(1.hour)

  case object H2 extends Granularity(2.hours)

  case object H3 extends Granularity(3.hours)

  case object H4 extends Granularity(4.hours)

  case object H6 extends Granularity(6.hours)

  case object H8 extends Granularity(8.hours)

  case object H12 extends Granularity(12.hours)

  case object D extends Granularity(1.day)

  case object W extends Granularity(1.week)

  case object M extends Granularity(1.month)

  // https://developer.oanda.com/rest-live-v20/instrument-df/#CandlestickGranularity
  val values = Seq(S1, S5, S10, S15, S30, M1, M2, M4, M5, M10, M15, M30, H1, H2, H3, H4, H6, H8, H12, D, W, M)
}
