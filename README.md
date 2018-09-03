# streaming-trading-quotes
Get streaming quotes from various brokers

## Brokers
* Oanda
* IG
* to add more brokers!


## Functionality
* Ohlc provides much richer information than Oanda's candlestick
(i.e. up tick volume, down tick volume, net tick volume, bid, ask)
* Alignment of Ohlc is the same as [Oanda](https://developer.oanda.com/rest-live-v20/instrument-df/#CandlestickGranularity)
* reduce streaming ticks into OHLC with tick volume
* Finer granularity than 250ms allowed by by oanda
* Handle out of sequence ticks
* Idempotently handle ticks (i.e. adding the same tick multiple times doesn't
change the Ohlc after the first successful add)
* benchmark all event operations and messaging bus operations


### Finer granularity than 250ms
Oanda only emits tick every 250ms.
> Get a stream of Account Prices starting from when the request is made.
This pricing stream does not include every single price created for the Account, but instead will provide at most 4 prices per second (every 250 milliseconds) for each instrument being requested.
If more than one price is created for an instrument during the 250 millisecond window, only the price in effect at the end of the window is sent. This means that during periods of rapid price movement, subscribers to this stream will not be sent every price.
Pricing windows for different connections to the price stream are not all aligned in the same way (i.e. they are not all aligned to the top of the second). This means that during periods of rapid price movement, different subscribers may observe different prices depending on their alignment.

By using multiple producers aligned differently and aggregating the results
in an idempotent way, we try to provider a finer grained ticks in a fast
moving market.
