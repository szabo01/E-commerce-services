# E-commerce-services
Este repositório tem a finalidade de demonstrar a implementação de um microservice com spring cloud, que foi criado em prol de uma atividade da disciplina de Arquitetura de Software.

# Definição da arquitetura
Desenvolver aplicações de software de forma conjunta, contribuindo para a equipe ter ganhos do tipo: 
<ol>
  <li>Escalável</li>
  <li>Independência</li>
  <li>Implementável</li>
</ol>
# Microservice
O objetivo principal de usar microservices é ajudar o time de desenvolvimento a entregar produtos de forma mais rápida, de maneira segura e com qualidade.

#Config-server
O config-service é um micro serviço onde vários micro-serviços podem consultar as propriedades da própria aplicação. Quando a aplicação eureka sobe, usa as configurações do servidor e solicita informações ao micro-service, sobre quais configurações precisa aplicar, se identificando pelo nome da aplicação.


#Service-discovery (Netflix eureka)
O netflix Eureka é um módulo do Netflix OSS, o qual permite que serviços sejam registrados atráves do Eureka Server e descobertos através do Eureka Client, facilitando o controle e comunicação.

#Zuul (API gateway)
É  uma solução de roteamento dinâmico, que possibilita o monitoramento, resiliência e segurança para aplicações, fazendo com que o spring-cloud-netflix opere de forma controlada e saudável.

#Configurações utilizadas para as API's presentes no projeto
http://localhost:6060/eureka
http://localhost:6060/account
http://localhost:6060/inventories
http://localhost:6060/order
http://localhost:6060/recommendation
http://localhost:6060/shipping
http://localhost:6060/zuul

#Referências:
<ol>
  <li>lelodois/spring-cloud</li>
  <li>https://emmanuelneri.com.br/2018/05/02/criando-proxy-de-apis-com-spring-cloud-zuul-e-eureka/</li>
  <li>https://www.luiztools.com.br/post/o-que-e-um-micro-servico-ou-microservice/</li>
</ol>
