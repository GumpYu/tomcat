package org.gump.three;

import org.gump.three.connector.http.HttpRequest;
import org.gump.three.connector.http.HttpResponse;
import java.io.IOException;

public class StaticResourceProcessor {

  public void process(HttpRequest request, HttpResponse response) {
    try {
      response.sendStaticResource();
    }
    catch (IOException e) {
      e.printStackTrace();
    }
  }

}
