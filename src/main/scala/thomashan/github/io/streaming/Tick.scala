package thomashan.github.io.streaming

import java.time.{Instant, ZonedDateTime}

import thomashan.github.io.quote.BidAsk

case class Tick(dateTime: ZonedDateTime,
                provider: String,
                instrument: String,
                bidAsk: BidAsk)
               (timestamp: Instant)
