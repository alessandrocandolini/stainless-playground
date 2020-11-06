import stainless.lang._
import stainless.collection._
import stainless.annotation._

object verified {

  def test = {
    1 + 1 == 2
  }.holds

  def f =
    Positive(1)

  def filterStringA(s : String) : Option[String] = {
    Some(s)
  } ensuring(_ != Some("A")) // this should return invalid with Princess, instead it returns UNKNOWN 

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

object NonEmptyString {

  def fromString : String => Option[NonEmptyString] = s => s match {
    case "" => None[NonEmptyString]
    case s => Some(NonEmptyString(s))
  }

}  

