import stainless.lang._
import stainless.collection._
import stainless.annotation._

object verified {

  def test = {
    1 + 1 == 2
  }.holds

  def f =
    Positive(1)

  def g : String => Option[NonEmptyString] =
    s =>
      Some(s).filter(s => s!="").map(s => NonEmptyString(s))

}

final case class Positive(value: BigInt) extends AnyVal {
  @invariant
  def isPositive: Boolean = value >= 0
}

final case class NonEmptyString(value: String) extends AnyVal {
  @invariant
  def nonEmpty: Boolean = value != ""
}

