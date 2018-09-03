package scala.time

import java.time.temporal.ChronoUnit._
import java.time.temporal.{TemporalAmount, TemporalUnit}
import java.time.{Duration, Period}

trait TemporalAmountConversions[T <: TemporalAmount] extends Any {
  protected def temporalAmount(temporalUnit: TemporalUnit): T
}

trait TemporalAmountIntConversions extends Any with TemporalAmountConversions[Period] {
  def year: Period = temporalAmount(YEARS)

  def years: Period = year


  def month: Period = temporalAmount(MONTHS)

  def months: Period = month


  def week: Period = temporalAmount(WEEKS)

  def weeks: Period = week


  def day: Period = temporalAmount(DAYS)

  def days: Period = day
}

trait TemporalAmountLongConversions extends Any with TemporalAmountConversions[Duration] {
  def hour: Duration = temporalAmount(HOURS)

  def hours: Duration = hour


  def minute: Duration = temporalAmount(MINUTES)

  def minutes: Duration = minute


  def second: Duration = temporalAmount(SECONDS)

  def seconds: Duration = second


  def microseconds: Duration = temporalAmount(MICROS)

  def micros: Duration = microseconds

  def microsecond: Duration = microseconds

  def micro: Duration = microseconds


  def milliseconds: Duration = temporalAmount(MILLIS)

  def millis: Duration = milliseconds

  def millisecond: Duration = milliseconds

  def milli: Duration = milliseconds


  def nano: Duration = temporalAmount(NANOS)

  def nanos: Duration = nano

  def nanosecond: Duration = nano

  def nanoseconds: Duration = nano
}

object TemporalAmountConversions {

  trait Classifier[C] {
    type R

    def convert(d: TemporalAmount): R
  }

}
