package com.myftiu.ratpack;

import ratpack.server.RatpackServer;

public class MainDemo {

   public static void main(String... args) throws Exception {
      RatpackServer.start(server -> server
         .handlers(chain -> chain
            .get(ctx -> ctx.render("Hello World!"))
            .get(":name", ctx -> ctx.render("Hello " + ctx.getPathTokens().get("name") + "!"))
         )
      );

   }

}
