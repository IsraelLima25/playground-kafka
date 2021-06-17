package br.com.playground.loja;

import java.util.UUID;
import java.util.concurrent.ExecutionException;

public class NewOrderMain {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        try (var dispatcher = new KafkaDispatcher()) {

            for (var i = 0; i < 10; i++) {
                var key = UUID.randomUUID().toString();
                var value = key + ",8645,4568";
                dispatcher.send("ECOMMERCE_NEW_ORDER", key, value);

                var email = "Email Send";
                dispatcher.send("ECOMMERCE_SEND_EMAIL", key, email);
            }
        }
    }
}
