import scala.io.StdIn.readLine
import scala.io.StdIn.readInt

object CaesarCipher extends App{
  val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

  val encrypt = (character: Char, alphabet:String, shift:Int) => alphabet((alphabet.indexOf(character.toUpper) + shift) % alphabet.length)

  val decrypt = (character: Char, alphabet:String, shift:Int) => alphabet((alphabet.indexOf(character.toUpper) - shift + alphabet.length) % alphabet.length)

  val Caesar_Cipher = (f:(Char,String,Int) => Char, alphabet: String, shift:Int , text: String) => text.map(f(_,alphabet, shift))

  def caesarCipherFunction():Unit={
    var cipherText:String = null
    var cipherTextArray = Array[String]()
    var plainText:String = null
    var plainTextArray = Array[String]()


    println("\n\t--CAESAR CIPHER--\n")

    print("Enter the shift: ")
    var shift = readInt()
    if(shift>0){
      shift = shift % 26

      val text = readLine("Enter the text to encrypt: ")
      var words = text.split(" +")

      //encrypting word by word
      for(w <- words){
        cipherText = Caesar_Cipher(encrypt, alphabet,shift, w)
        cipherTextArray = cipherTextArray:+cipherText
      }
      print("\nThe encrypted text is ")
      cipherTextArray.foreach(i=>print(i+" "))

      //decrypting word by word
      for(w <- cipherTextArray){
        plainText = Caesar_Cipher(decrypt, alphabet,shift, w)
        plainTextArray = plainTextArray:+plainText
      }
      print("\nThe decrypted text is ")
      plainTextArray.foreach(i=>print(i+" "))
      println()
    }
    else{
      println("Invalid shift")
      println()
    }
  }

  caesarCipherFunction()
}