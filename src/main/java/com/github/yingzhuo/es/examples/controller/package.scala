/*
*  .        _           _   _                              _                                          _           __ _ _
* /\\   ___| | __ _ ___| |_(_) ___ ___  ___  __ _ _ __ ___| |__         _____  ____ _ _ __ ___  _ __ | | ___  ___ \ \ \ \
*( ( ) / _ \ |/ _` / __| __| |/ __/ __|/ _ \/ _` | '__/ __| '_ \ _____ / _ \ \/ / _` | '_ ` _ \| '_ \| |/ _ \/ __| \ \ \ \
* \\/ |  __/ | (_| \__ \ |_| | (__\__ \  __/ (_| | | | (__| | | |_____|  __/>  < (_| | | | | | | |_) | |  __/\__ \  ) ) ) )
*  '   \___|_|\__,_|___/\__|_|\___|___/\___|\__,_|_|  \___|_| |_|      \___/_/\_\__,_|_| |_| |_| .__/|_|\___||___/ / / / /
* =============================================================================================|_|=============== /_/_/_/
*/
package com.github.yingzhuo.es.examples

package object controller {

    final case class Json(code: String = "200", errorMessage: String =  null, payload: Map[String, Any] = Map()) {
        def this(p: Map[String, Any]) = this(payload = p)

        def size: Int = payload match {
            case null => 0
            case _ => payload.size
        }

        def empty: Boolean = payload match {
            case null => true
            case _ => payload.isEmpty
        }
    }

    object Json {

        def apply(p: Map[String, Any]): Json = new Json(p)

        def apply(t: (String, Any)): Json = Json(Map(t._1 -> t._2))
    }

}
