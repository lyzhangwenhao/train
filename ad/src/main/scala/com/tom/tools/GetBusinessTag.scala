package com.tom.tools

import java.io.UnsupportedEncodingException
import java.net.URLEncoder
import java.security.NoSuchAlgorithmException
import java.util
import java.util.Map.Entry

import scala.collection.mutable


/**
 * ClassName: GetBusinessTag
 * Description:
 *
 * @date 2019/12/20 8:45
 * @author Mi_dad
 */
object GetBusinessTag {

//  import java.io.UnsupportedEncodingException
//  import java.security.NoSuchAlgorithmException
//
//  @throws[UnsupportedEncodingException]
//  @throws[NoSuchAlgorithmException]
//  def main(args: Array[String]): Unit = {
//    // 计算sn跟参数对出现顺序有关，get请求请使用LinkedHashMap保存<key,value>，该方法根据key的插入顺序排序；post请使用TreeMap保存<key,value>，该方法会自动将key按照字母a-z顺序排序。所以get请求可自定义参数顺序（sn参数必须在最后）发送请求，但是post请求必须按照字母a-z顺序填充body（sn参数必须在最后）。以get请求为例：http://api.map.baidu.com/geocoder/v2/?address=百度大厦&output=json&ak=yourak，paramsMap中先放入address，再放output，然后放ak，放入顺序必须跟get请求中对应参数的出现顺序保持一致。
//    val paramsMap = mutable.LinkedHashMap[String,String]()
//    paramsMap.put("address", "百度大厦")
//    paramsMap.put("output", "json")
//    paramsMap.put("ak", "yourak")
//    // 调用下面的toQueryString方法，对LinkedHashMap内所有value作utf8编码，拼接返回结果address=%E7%99%BE%E5%BA%A6%E5%A4%A7%E5%8E%A6&output=json&ak=yourak
//    val paramsStr = toQueryString(paramsMap)
//    // 对paramsStr前面拼接上/geocoder/v2/?，后面直接拼接yoursk得到/geocoder/v2/?address=%E7%99%BE%E5%BA%A6%E5%A4%A7%E5%8E%A6&output=json&ak=yourakyoursk
//    val wholeStr = new String("/geocoder/v2/?" + paramsStr + "yoursk")
//    // 对上面wholeStr再作utf8编码
//    val tempStr = URLEncoder.encode(wholeStr, "UTF-8")
//    // 调用下面的MD5方法得到最后的sn签名7de5a22212ffaa9e326444c75a58f9a0
//    System.out.println(MD5(tempStr))
//  }
//
//  // 对Map内所有value作utf8编码，拼接返回结果
//  @throws[UnsupportedEncodingException]
//  def toQueryString(
//  : Nothing): String = {
//    val queryString = new StringBuffer
//    import scala.collection.JavaConversions._
//    for (pair <- data.entrySet) {
//      queryString.append(pair.getKey + "=")
//      queryString.append(URLEncoder.encode(pair.getValue.asInstanceOf[String], "UTF-8") + "&")
//    }
//    if (queryString.length > 0) queryString.deleteCharAt(queryString.length - 1)
//    queryString.toString
//  }
//
//  // 来自stackoverflow的MD5计算方法，调用了MessageDigest库函数，并把byte数组结果转换成16进制
//  def MD5(md5: String): String = {
//    try {
//      val md = java.security.MessageDigest.getInstance("MD5")
//      val array = md.digest(md5.getBytes)
//      val sb = new StringBuffer
//      var i = 0
//      while ( {
//        i < array.length
//      }) {
//        sb.append(Integer.toHexString((array(i) & 0xFF) | 0x100).substring(1, 3))
//
//        {
//          i += 1; i
//        }
//      }
//      return sb.toString
//    } catch {
//      case e: NoSuchAlgorithmException =>
//
//    }
//    null
//  }
}

