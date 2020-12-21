⚠ Necessário importar a classe KafkaConsumerConfig no início da aplicação, para que use o desserializador correto.
```
@SpringBootApplication
@EnableKafka
@Import(KafkaConsumerConfig.class)
public class MyApplication {
    ...
}
```