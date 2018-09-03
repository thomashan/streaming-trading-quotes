package thomashan.github.io.ohlc

import java.time.{Instant, ZonedDateTime}

import thomashan.github.io.ohlc.Granularities.Granularity
import thomashan.github.io.quote.BidAsk

case class Ohlc(dateTime: ZonedDateTime,
                provider: String,
                instrument: String,
                granularity: Granularity,
                open: BidAsk,
                high: BidAsk,
                low: BidAsk,
                close: BidAsk,
                volume: Int,
                dateTimeReported: ZonedDateTime)
               (timestamp: Instant)
