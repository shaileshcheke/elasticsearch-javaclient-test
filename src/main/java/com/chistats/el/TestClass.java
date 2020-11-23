package com.chistats.el;
import org.apache.http.HttpHost;
import org.elasticsearch.action.bulk.BulkRequest;
import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.client.indices.GetIndexRequest;
//import org.elasticsearch.common.xcontent.XContentType;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.elasticsearch.action.bulk.BulkRequestBuilder;
import org.elasticsearch.action.bulk.BulkResponse;
import org.elasticsearch.client.Client;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
public class TestClass {
       public static void main(String[] args){
          try{
                 RestHighLevelClient client = new RestHighLevelClient(RestClient.builder(new HttpHost("localhost", 9200, "http")));
                 GetIndexRequest request = new GetIndexRequest("ardent_test");
                 boolean exists = client.indices().exists(request, RequestOptions.DEFAULT);
                 if(exists){
                        System.out.println("Index exists");
                 } else{
                        System.out.println("Index does not exists");
                 }

          } catch(Exception ex){
                 ex.printStackTrace();
          }
       }
}
