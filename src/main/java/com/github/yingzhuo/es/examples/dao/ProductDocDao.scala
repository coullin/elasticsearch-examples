package com.github.yingzhuo.es.examples.dao

import com.github.yingzhuo.es.examples.model.ProductDoc
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository

trait ProductDocDao extends ElasticsearchRepository[ProductDoc, String]
