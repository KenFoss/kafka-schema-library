package com.demo.schema;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}
//
//    static class FileHandler implements HttpHandler {
//        @Override
//        public void handle(HttpExchange exchange) throws IOException {
//            String filePath = "path/to/repo/com/demo/schema/shared-schema-library/1.0-SNAPSHOT/schema_library-1.0-SNAPSHOT.jar";
//            byte[] fileBytes = Files.readAllBytes(Paths.get(filePath));
//            exchange.sendResponseHeaders(200, fileBytes.length);
//            OutputStream os = exchange.getResponseBody();
//            os.write(fileBytes);
//            os.close();
//        }
//    }
//}
