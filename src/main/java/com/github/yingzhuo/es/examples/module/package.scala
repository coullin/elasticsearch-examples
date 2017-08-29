/*
*  .        _           _   _                              _                                          _           __ _ _
* /\\   ___| | __ _ ___| |_(_) ___ ___  ___  __ _ _ __ ___| |__         _____  ____ _ _ __ ___  _ __ | | ___  ___ \ \ \ \
*( ( ) / _ \ |/ _` / __| __| |/ __/ __|/ _ \/ _` | '__/ __| '_ \ _____ / _ \ \/ / _` | '_ ` _ \| '_ \| |/ _ \/ __| \ \ \ \
* \\/ |  __/ | (_| \__ \ |_| | (__\__ \  __/ (_| | | | (__| | | |_____|  __/>  < (_| | | | | | | |_) | |  __/\__ \  ) ) ) )
*  '   \___|_|\__,_|___/\__|_|\___|___/\___|\__,_|_|  \___|_| |_|      \___/_/\_\__,_|_| |_| |_| .__/|_|\___||___/ / / / /
* =============================================================================================|_|=============== /_/_/_/
*/
package com.github.yingzhuo.es.examples

package object module {

    import com.github.yingzhuo.es.examples.module._

    implicit final class RichProductDoc(val doc: ProductDoc) {
        require(doc != null)

        def toProduct: Product = {
            val prod = new Product
            prod.id = doc.id
            prod.name = doc.name
            prod.price = doc.price
            prod.description = doc.description
            prod
        }
    }

    implicit final class RichProduct(val prod: Product) {
        require(prod != null)

        def toProductDoc: ProductDoc = {
            val doc = new ProductDoc
            doc.id = prod.id
            doc.name = prod.name
            doc.price = prod.price
            doc.description = prod.description
            doc
        }
    }
}