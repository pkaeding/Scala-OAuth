package jm.oauth

import jm.oauth.messagesigner._

trait MessageSigner {
  def createSignature(key: String, token: String, method: String, url: String, requestParams: Map[String, String]): String

}

object MessageSigner {
   /**
   * Simple factory for MessageSigner objects based on this.signatureMethod value
   */
  def signatureFactory(signature: String): MessageSigner = signature match {
    case OAuth.HMAC_SHA1 => new HmacSha1()
    case OAuth.PLAINTEXT => new Plaintext()
  }
}
