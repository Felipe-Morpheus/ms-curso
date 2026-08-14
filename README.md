>RabbitMQ - Mensageria

>Java: Linguagem de programação

>Maven: Gerenciador de dependencias


>Ecossistema Spring;
Spring Boot para inicializar os microsservices de negócio;
Spring Web para realizar os ENDPOINTS;
Spring JPA transações com base de dados;
Spring Validation para validações de entrada da API;
Spring AMQP para trabalhar com protocolo de mensageria e realizar comunicação assíncrona entre eles;
Spring Mail para enviar o email para os usuários que forem se cadastrando na plataforma.

>PostgreSQL: Base de dados

RABBIT MQ: Broker/ Servidor
CLOUD AMQP: Plataforma para configurar e monitorar os processos de fila(queues) do broker(servidor)

>SMTP GMAIL: Para fazer o envio de Email

>Principais pilares de RabbitMQ: 
 
• produtor (producer)>>

O produtor é responsável por criar e enviar mensagens para o broker (servidor RabbitMQ). Ele geralmente representa a parte do sistema que gera eventos, dados ou solicitações que precisam ser processadas por outros componentes. Também publica as mensagens em filas ou trocas (exchanges) no servidor.

Exemplos de produtores podem ser: aplicativos, serviços ou microserviços que geram eventos, notificações ou solicitações de processamento assíncrono. 

• consumidor (consumer)>>

O consumidor é responsável por receber e processar as mensagens que são publicadas pelo produtor no RabbitMQ.
Ele se conecta ao broker (RabbitMQ) e se inscreve em filas ou trocas específicas para receber mensagens relevantes para sua funcionalidade.
Os consumidores podem processar as mensagens recebidas de várias maneiras, como executar tarefas, gerar respostas, atualizar dados ou disparar eventos adicionais no sistema.

Exemplos de consumidores podem ser: processadores de eventos, serviços de backend, trabalhadores assíncronos ou microsserviços que respondem a mensagens recebidas.


